("Nombre del Instituto"),
/ies/nombre,
("Página web del Instituto:"),
/ies/web/text(),
("Nombre de los Ciclos Formativos:"),
//ciclo/nombre/text(),
("Siglas por las que se conocen los Ciclos Formativos:"),
//ciclo//@id,
("Años en los que se publicaron los decretos de título de los Ciclos Formativos:"),
//decretoTitulo/@año,
("Ciclos Formativos de Grado Medio (se trata de obtener el elemento <ciclo>completo):"),
//ciclo[grado="Medio"],
("Nombre de los Ciclos Formativos de Grado Superior:"),
//ciclo[grado="Superior"]/nombre,
("Nombre de los Ciclos Formativos anteriores a 2010:"),
//ciclo[decretoTitulo/@año<2010]/nombre/text(),
("Nombre de los Ciclos Formativos de 2008 o 2010:"),
//ciclo[decretoTitulo/@año=2010 or decretoTitulo/@año=2008]/nombre/text(),
//@año[.=2010 or .=2008]/../../nombre/text()