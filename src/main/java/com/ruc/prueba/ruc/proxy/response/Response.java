package com.ruc.prueba.ruc.proxy.response;


public class Response {
    private Object data;
    private String mensaje;
    private String error;

    public Response(Object data, String mensaje) {
        this.data = data;
        this.mensaje = mensaje;
    }

    public Response(Object data, String mensaje, String error) {
        this.data = data;
        this.mensaje = mensaje;
        this.error = error;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
