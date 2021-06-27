package com.devco.utils;

public abstract class Constants {
    public static final String PAGE_URL = "https://www.travelocity.com/";

    public enum Security {

        ALGORITHM("AES"),
        FWK_FRASE_SEGURIDAD("V3nT7sb@n0m1Bd1G");

        private String valor;

        Security(String valor) {
            this.valor = valor;
        }

        public String getValue() {
            return valor;
        }
    }

}
