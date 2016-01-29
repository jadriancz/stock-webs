/**
 * PropertiesKeys.java
 * 1.1.0
 * 15 Mayo 2013
 * Circulo de CrÈdito
 */
package mx.com.stock.properties;


public enum PropertiesKeys {
    
  
    
   // VALORES PARA EL APLICATIVO DE CL  
    VALOR_INICIAL("label.eName"),
   
  
    
    NAME_ERROR_CORREO("name.errorCorreo"),
    MENSAJE_ERROR("name.error"),
    ENVIO_LIGA("name"),
    
    MENSAJE("name.mensaje"), 
    MENSAJE_TOPICO("mensaje.error.topico"),
    MENSAJE_LIGA("mensaje.liga"),
    
    
    
    MENSAJE_NOMBRE_REQUERIDO("mensaje.error.nombre.requerido"),
    MENSAJE_DESCRIPCION_REQUERIDA("mensaje.error.descripcion.requerido"),
    MENSAJE_ERROR_TOPICO("mensaje.error.topico"),
    MENSAJE_ERROR_EMPRESA("mensaje.error.empresa"),
    MENSAJE_FECHA_ACTIVA("mensaje.error.fecha"),
    MENSAJE_FECHA_MENOR_ACTIVA("mensaje.error.fecha.Activa"),
    MENSAJE_ERROR_LIMITE("mensaje.error.limite"),
    MENSAJE_ERROR_LIMITE_MENOR("mensaje.error.limite.Menor"),
    MENSAJE_ERROR_PERFIL("mensaje.error.perfil"),
    MENSAJE_ERROR_PREGUNTA("mensaje.error.pregunta"),
    MENSAJE_ERROR_NOMBRE("mensaje.error.nombre"),
    MENSAJE_ERROR_PATERNO("mensaje.error.paterno"),
    MESAJE_ERROR_CORREO("mensaje.error.correo"),
    MENSAJE_ERROR_CORREO2("mensaje.error.correo2"),
    MENSAJE_ERROR_CORREO3("mensaje.error.correo3"),
    MENSAJE_ERROR_CORREO_NO("mensaje.error.correo.no"),    
    MENSAJE_ERROR_LONGITUD("mensaje.error.longitud"),

    
    
    
    
    // CONFIGURACION DE UPLOAD
    MENSAJE_ERROR_NOFILE("mensaje.error.nofile"),
    MENSAJE_ERROR_TAMANIO("mensaje.error.tamanio"),
    MENSAJE_ERROR_TIPO("mensaje.error.tipo"), 
    MENSAJE_SIN_INFORMACION("mensaje.error.informacion"),
    MENSAJE_EXITOSO("mensaje.exito.carga"),
    MENSAJE_ERROR_GENERO("mensaje.error.genero"),
    MENSAJE_ERROR_CORREO("mensaje.error.correo"),
    MENSAJE_ERROR_CORREO_NOENVIADO("mensaje.error.correo.noenviado"),
    
    
    
    
    
    
    // CONFIGURACION DE MENSAJES VALIDACIONES ACTION
    MENSAJE_ERROR_TAMANIO_FILE("mensaje.error.tamanio.file"),
    MENSAJE_ERROR_CONEXION_BD("mensaje.error.conexion.bd"),
    MENSAJE_ERROR_PREGUNTA_NOENLAZAR("mensaje.error.pregunta.noenlazar"),
    MENSAJE_ERROR_PREGUNTA_NOALEATORIA("mensaje.error.pregunta.noaleatoria"),
    MENSAJE_ERROR_PREGUNTA_OBLIGATORIA("mensaje.error.pregunta.obligatoria"),
    MENSAJE_ERROR_CAMPO_REQUERIDO("mensaje.error.campo.requerido"),
    MENSAJE_ERROR_CONSULTA("mensaje.error.consulta"),
    MENSAJE_ERROR_ERROR("mesaje.error"),
    MENSAJE_VALIDACION_CRITERIO("mensaje.validacion.criterio"),
    MENSAJE_VALIDACION_NO_RESULTADOS("mensaje.validacion.noresultados"),
    MENSAJE_GENERO_ERROR("mensaje.genero.error.consulta"),
    
    
    
    //Configuracion para el correo electronico externo
    MAIL_SMTP_HOST("mail.smtp.host"),
    MAIL_SMTP_STARTTLS_ENABLE("mail.smtp.starttls.enable"),
    MAIL_SMTP_PORT("mail.smtp.port"),
    MAIL_SMTP_USER("mail.smtp.user"),
    MAIL_SMTP_AUTH("mail.smtp.auth"),
    mail_smtp_ssl_checkserveridentity("mail.smtp.ssl.checkserveridentity"),
    mail_transport_protocol("mail.transport.protocol"),
    MAIL_SMTP_PWD("mail.smtp.pass"),
    
    MENSAJE_ERROR_CANDIDATO("mensaje.error.candidatos"),
    
    URL_HOST_EVALUACION_CLAVE("url.host.evaluacion.clave"),
    
    MAIL_INCORRECTO("MAIL_INCORRECTO"),
    // configuracion imagenes
    
    
    MENSAJE_ERROR_UNA_OPCION("mensaje.error.una.opcion"),
    MENSAJE_ERROR_UNA_OPCION2("mensaje.error.una.opcion2"),
    MENSAJE_ERROR_SELECCION_PREGUNTA("mensaje.error.seleccion.pregunta"),
    MENSAJE_ERROR_REQUERIDO_PREGUNTA("mensaje.error.requerido.pregunta"),
    
    RUTA_WEBLOGIC("ruta.archivo");

   
    
    private String key;

    PropertiesKeys(String key) {
          this.key = key;
    }

    public String getKey() {
          return this.key;
    }
}