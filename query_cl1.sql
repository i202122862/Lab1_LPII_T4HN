use bdhibernate3;

CREATE TABLE Empleado (
    IdEmpleado INT AUTO_INCREMENT PRIMARY KEY,
    Apellidos VARCHAR(255) NOT NULL,
    Nombres VARCHAR(255) NOT NULL,
    Edad INT NOT NULL,
    Sexo ENUM('M', 'F') NOT NULL,
    Salario DECIMAL(10, 2) NOT NULL
);

select * from empleado;
