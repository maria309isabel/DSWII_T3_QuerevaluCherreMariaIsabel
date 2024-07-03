package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.controller;

import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.Usuario;
import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.dto.UsuarioSeguDto;
import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.service.DetalleUsuarioService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/auth")
public class AuthController {
    private DetalleUsuarioService detalleUsuarioService;
    private AuthenticationManager authenticationManager;

    @GetMapping("/login")
    @Transactional(readOnly = true)
    public ResponseEntity<UsuarioSeguDto> autenticarUsuario(
            @RequestParam("usuario") String usuario,
            @RequestParam("password") String password
    ) throws  Exception{
        try{
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            usuario, password
                    ));
            if(authentication.isAuthenticated()){
                Usuario objUsuario = detalleUsuarioService
                        .obtenerUsuarioXNomusuario(usuario);
                String token = generarToken(objUsuario);
                UsuarioSeguDto usuarioSeguridadDto =
                        new UsuarioSeguDto(objUsuario.getIdusuario(),
                                usuario, token);
                return new ResponseEntity<>(usuarioSeguridadDto, HttpStatus.OK);
            }else {
                return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
            }
        }catch (Exception ex){
            throw  new Exception("Usuario y/u password incorrecto");
        }
    }
    private String generarToken(Usuario usuario){
        String clave = "@EFMARIA";
        List<GrantedAuthority> grantedAuthorityList =
                detalleUsuarioService.obtenerListaRoles(usuario.getRoles());
        String token = Jwts.builder()
                .setId(usuario.getIdusuario().toString())
                .setSubject(usuario.getNomusuario())
                .claim("authorities",
                        grantedAuthorityList.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList())
                )
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+ 300000))
                .signWith(SignatureAlgorithm.HS512, clave.getBytes())
                .compact();
        return token;
    }
}
