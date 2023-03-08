package presentacion.controller;

public enum Evento {
	// Nuevo Enum Evento creado para agilizar la gestion de eventos
	
	// El sistema de ints estaticos suponia una gran perdida de tiempo
	// cada vez que se cambiaban los requisitos 
	
	// Gui
	MOSTRAR_INICIO,
	
	// Pelicula
	// Request
	REGISTRAR_PELICULA,
	MODIFICAR_PELICULA,
	BORRAR_PELICULA,
	BUSCAR_PELICULA,
	MOSTRAR_LISTA_PELICULA,
	MOSTRAR_POR_FECHA_PELICULA,
	PELICULAS_MAS_VENDIDAS,
	
	// Response
	REGISTRAR_PELICULA_OK,
	REGISTRAR_PELICULA_KO,
	
	MODIFICAR_PELICULA_OK,
	MODIFICAR_PELICULA_KO,
	
	BORRAR_PELICULA_OK,
	BORRAR_PELICULA_KO,
	
	BUSCAR_PELICULA_OK,
	BUSCAR_PELICULA_KO,
	
	MOSTRAR_LISTA_PELICULA_OK,
	MOSTRAR_LISTA_PELICULA_KO,
	
	MOSTRAR_POR_FECHA_PELICULA_OK,
	MOSTRAR_POR_FECHA_PELICULA_KO,
	
	PELICULAS_MAS_VENDIDAS_OK,
	PELICULAS_MAS_VENDIDAS_KO,
	
	// Pase
	// Request
	REGISTRAR_PASE,
	MODIFICAR_PASE,
	BORRAR_PASE,
	BUSCAR_PASE,
	MOSTRAR_LISTA_PASE,
	MOSTRAR_POR_PELICULA_PASE,
	
	// Response
	REGISTRAR_PASE_OK,
	REGISTRAR_PASE_KO,
	
	MODIFICAR_PASE_OK,
	MODIFICAR_PASE_KO,
	
	BORRAR_PASE_OK,
	BORRAR_PASE_KO,
	
	BUSCAR_PASE_OK,
	BUSCAR_PASE_KO,
	
	MOSTRAR_LISTA_PASE_OK,
	MOSTRAR_LISTA_PASE_KO,
	
	MOSTRAR_POR_PELICULA_PASE_OK,
	MOSTRAR_POR_PELICULA_PASE_KO,
	
	// Empleado
	// Request
	REGISTRAR_EMPLEADO,
	MODIFICAR_EMPLEADO,	
	BORRAR_EMPLEADO,
	BUSCAR_EMPLEADO,
	MOSTRAR_LISTA_EMPLEADO,
	MOSTRAR_POR_JORNADA_EMPLEADO,

	// Response
	REGISTRAR_EMPLEADO_OK,
	REGISTRAR_EMPLEADO_KO,
	
	MODIFICAR_EMPLEADO_OK,
	MODIFICAR_EMPLEADO_KO,
	
	BORRAR_EMPLEADO_OK,
	BORRAR_EMPLEADO_KO,
	
	BUSCAR_EMPLEADO_OK,
	BUSCAR_EMPLEADO_KO,
	
	MOSTRAR_LISTA_EMPLEADO_OK,
	MOSTRAR_LISTA_EMPLEADO_KO,
	
	MOSTRAR_POR_JORNADA_EMPLEADO_OK,
	MOSTRAR_POR_JORNADA_EMPLEADO_KO,
	
	// Factura
	// Request
	ABRIR_FACTURA,
	AÑADIR_PASE,
	QUITAR_PASE,
	CERRAR_FACTURA,
	DEVOLVER_PASE,
	BUSCAR_FACTURA,
	MOSTRAR_LISTA_FACTURA,
	
	//Response
	// ABRIR_FACTURA_OK,
	// ABRIR_FACTURA_KO,
	
	AÑADIR_PASE_OK,
	AÑADIR_PASE_KO,
		
	QUITAR_PASE_OK,
	QUITAR_PASE_KO,
	
	CERRAR_FACTURA_OK,
	CERRAR_FACTURA_KO,
	
	DEVOLVER_PASE_OK,
	DEVOLVER_PASE_KO,
		
	BUSCAR_FACTURA_OK,
	BUSCAR_FACTURA_KO,
		
	MOSTRAR_LISTA_FACTURA_OK,
	MOSTRAR_LISTA_FACTURA_KO,
	
	// Marca
	// Request
	REGISTRAR_MARCA,	 
	MODIFICAR_MARCA,
	BORRAR_MARCA,
	BUSCAR_MARCA,
	MOSTRAR_MARCAS,	 
	MOSTRAR_CALORIAS_MEDIAS_DE_MARCA,
	MOSTRAR_PRODUCTOS_POR_MARCA,

	// Response
	REGISTRAR_MARCA_OK,
	REGISTRAR_MARCA_KO,

	MODIFICAR_MARCA_OK,
	MODIFICAR_MARCA_KO,

	BORRAR_MARCA_OK,
	BORRAR_MARCA_KO,

	BUSCAR_MARCA_OK,
	BUSCAR_MARCA_KO,
	
	MOSTRAR_MARCAS_OK,
	MOSTRAR_MARCAS_KO,
	
	MOSTRAR_CALORIAS_MEDIAS_DE_MARCA_OK,
	MOSTRAR_CALORIAS_MEDIAS_DE_MARCA_KO,
	
	MOSTRAR_PRODUCTOS_POR_MARCA_OK,
	MOSTRAR_PRODUCTOS_POR_MARCA_KO,
	
	// Proveedor
	// Request
	REGISTRAR_PROVEEDOR,
	MODIFICAR_PROVEEDOR,	 
	BORRAR_PROVEEDOR,
	BUSCAR_PROVEEDOR,
	MOSTRAR_PROVEEDORES,

	// Response
	REGISTRAR_PROVEEDOR_OK,
	REGISTRAR_PROVEEDOR_KO,

	MODIFICAR_PROVEEDOR_OK,
	MODIFICAR_PROVEEDOR_KO,

	BORRAR_PROVEEDOR_OK,
	BORRAR_PROVEEDOR_KO,

	BUSCAR_PROVEEDOR_OK,
	BUSCAR_PROVEEDOR_KO,
	 
	MOSTRAR_PROVEEDORES_OK,
	MOSTRAR_PROVEEDORES_KO,
	
	// Producto
	// Request
	REGISTRAR_PRODUCTO,
	MODIFICAR_PRODUCTO,
	BORRAR_PRODUCTO,
	BUSCAR_PRODUCTO,
	MOSTRAR_PRODUCTOS,
	//MOSTRAR_PRODUCTO_MAS_CALORICO,
	MOSTRAR_PRODUCTOS_CON_MAS_DE_X_STOCK,

	// Response
	REGISTRAR_PRODUCTO_OK,
	REGISTRAR_PRODUCTO_KO,

	MODIFICAR_PRODUCTO_OK,
	MODIFICAR_PRODUCTO_KO,

	BORRAR_PRODUCTO_OK,
	BORRAR_PRODUCTO_KO,

	BUSCAR_PRODUCTO_OK,
	BUSCAR_PRODUCTO_KO,
	
	MOSTRAR_PRODUCTOS_OK,
	MOSTRAR_PRODUCTOS_KO,
	
	//MOSTRAR_PRODUCTO_MAS_CALORICO_OK,
	//MOSTRAR_PRODUCTO_MAS_CALORICO_KO,

	MOSTRAR_PRODUCTOS_CON_MAS_DE_X_STOCK_OK,
	MOSTRAR_PRODUCTOS_CON_MAS_DE_X_STOCK_KO,
	
	// FacturaTienda
	// Request
	ABRIR_FACTURA_TIENDA,
	AÑADIR_PRODUCTO,
	QUITAR_PRODUCTO,
	CERRAR_FACTURA_TIENDA,
	DEVOLVER_PRODUCTO,
	BUSCAR_FACTURA_TIENDA,
	LISTAR_FACTURAS_TIENDA,
	//MOSTRAR_FACTURA_POR_PRODUCTO_CON_PRECIO_MINIMO,

	// Response
	// ABRIR_FACTURA_TIENDA_OK,
	// ABRIR_FACTURA_TIENDA_KO,
		
	 AÑADIR_PRODUCTO_OK,
	 AÑADIR_PRODUCTO_KO,
		
	 QUITAR_PRODUCTO_OK,
	 QUITAR_PRODUCTO_KO,
	
	 CERRAR_FACTURA_TIENDA_OK,
	 CERRAR_FACTURA_TIENDA_KO,
	
	 DEVOLVER_PRODUCTO_OK,
	 DEVOLVER_PRODUCTO_KO,
		
	 BUSCAR_FACTURA_TIENDA_OK,
	 BUSCAR_FACTURA_TIENDA_KO,

	 LISTAR_FACTURAS_TIENDA_OK,
	 LISTAR_FACTURAS_TIENDA_KO,
	 
	 //MOSTRAR_FACTURA_POR_PRODUCTO_CON_PRECIO_MINIMO_OK,
	 //MOSTRAR_FACTURA_POR_PRODUCTO_CON_PRECIO_MINIMO_KO
}