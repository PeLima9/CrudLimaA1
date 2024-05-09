package modelo

import java.lang.Exception
import java.sql.Connection
import java.sql.DriverManager

class ConnectionClass {
    fun cadenaConexion(): Connection? {
        try {
            val ip = "jdbc:oracle:thin:@10.10.2.70:1521:xe"
            val user = "SYSTEM"
            val password = "ITR2024"

            val conexion = DriverManager.getConnection(ip, user, password)
            return conexion
        }
        catch (e: Exception){
            println("Error: $e")
            return null
        }
    }
}
