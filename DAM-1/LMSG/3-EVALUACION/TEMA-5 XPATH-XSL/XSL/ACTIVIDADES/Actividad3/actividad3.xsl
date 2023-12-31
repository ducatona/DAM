﻿<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" encoding="utf-8" indent="yes"/>
  <xsl:template match="/">
    <html>
      <head>
        <title>Actividad3</title>
        <link rel="stylesheet" type="text/css" href="estilo3.css"/>
      </head>
      <body>
        <h1>Modulos</h1>
        <h1></h1>
        <table>
          <th>Nombre</th>
          <th colspan="3">Ciclos</th>
          <xsl:for-each select="//modulo">
          <xsl:sort select="nombre"></xsl:sort>
            <tr>
              <td>
                <xsl:value-of select="nombre"/>
              </td>
              <xsl:for-each select="ciclos/ciclo">
                <td>
                  <xsl:value-of select="@siglas"/>
                </td>
              </xsl:for-each>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
