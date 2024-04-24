/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hugos
 */
class Administrador {
    private String correo;
    private String clave;
    public Administrador(String correo, String contraseña){
        this.correo=correo;
        this.clave=contraseña;
    }
    public String getCorreo(){return correo;}
    public String getClave(){return clave;}
}
