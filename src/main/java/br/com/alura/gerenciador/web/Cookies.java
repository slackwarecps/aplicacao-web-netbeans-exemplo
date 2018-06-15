/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.gerenciador.web;

import javax.servlet.http.Cookie;

/**
 *
 * @author fabioalvaro
 */
public class Cookies {
    private final Cookie[] cookies;

    public Cookies(Cookie[] cookies) {
        this.cookies = cookies;
    }

    Cookie buscaUsuarioLogado() {
//       Cookie[] cookies = req.getCookies();
        if (cookies == null) {
            return null;
        }

        for (Cookie cookieItem : cookies) {
            if (cookieItem.getName().equals("usuario.logado")) {
                //Mudar expiracao do cookie ganha mais 10 minutos
                // cookieItem.setMaxAge(10 * 60);
               
               return cookieItem;
            }

        }
        return null;
    }
    
}
