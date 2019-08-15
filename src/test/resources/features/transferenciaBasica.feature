# language: es

Característica: Probar transferencias bancarias
  Como probador de la aplicación
  Quiero validar transferencias bancarias
  Para verificar sus respuestas

  Escenario: Probar transferencia bancaria exitosa entre 2 cuentas
    Dado estoy logueado en la pagina de ACTIVOS TI
    Cuando realizo una transferencia a la cuenta '123123123'
    Entonces visualizo correctamente el comprobante de la transferencia

Característica: preparar desayuno desde que me despierto. tener en cuenta todas las actividades a realizar

  Escenario: Preparar huevos fritos y chocolate
    Dado estoy en la cocina
    Cuando selecciono ingredientes y utencilios
    Y preparo los huevos
    Y preparo el chocolate
    Entonces puedo desayunar tranquilamente


Característica: probar la existencia de SUFI en la tabla centro de costos de la pagina ACTIVOS TI

  Escenario: Probar transferencia bancaria exitosa entre 2 cuentas
    Dado estoy logueado en la pagina de ACTIVOS TI
    Cuando navego en el menu hasta la opcion centro de costos
    Entonces validar la existencia de 'SUFI' en la tabla centro de costos