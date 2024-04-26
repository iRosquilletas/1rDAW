CREATE DATABASE reservas_vuelos;
USE reservas_vuelos;

CREATE TABLE Vuelos (
    id_vuelo INT AUTO_INCREMENT PRIMARY KEY,
    numero_vuelo INT,
    origen VARCHAR(255),
    destino VARCHAR(255),
    fecha DATE,
    capacidad INT
);

CREATE TABLE Pasajeros (
    id_pasajero INT AUTO_INCREMENT PRIMARY KEY,
    numero_pasaporte INT,
    nombre_pasajero VARCHAR(255)
);

CREATE TABLE Vuelos_Pasajeros (
    id_vuelo INT,
    id_pasajero INT,
    n_asiento INT,
    PRIMARY KEY (id_vuelo, id_pasajero),
    FOREIGN KEY (id_vuelo) REFERENCES Vuelos(id_vuelo),
    FOREIGN KEY (id_pasajero) REFERENCES Pasajeros(id_pasajero)
);
