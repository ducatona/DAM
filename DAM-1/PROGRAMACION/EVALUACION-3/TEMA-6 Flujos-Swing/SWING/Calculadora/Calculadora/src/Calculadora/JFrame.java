/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculadora;

import java.io.IOException;

/**
 *
 * @author carra
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form calculadora2
     */
    private double num1 = 0, num2 = 0, res = -1;
    private String aux = "";
    private boolean operacion = false;
    private byte control = -1;

    public JFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Digitos = new javax.swing.JPanel();
        C10 = new javax.swing.JButton();
        C0 = new javax.swing.JButton();
        C = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        C9 = new javax.swing.JButton();
        Operadores = new javax.swing.JPanel();
        division = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        producto = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        resultado = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        elevado = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        n2 = new javax.swing.JTextField();
        n1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(285, 299));
        setResizable(false);
        setSize(new java.awt.Dimension(285, 299));

        Digitos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        C10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        C10.setText(",");
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });

        C0.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        C0.setText("0");
        C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C0ActionPerformed(evt);
            }
        });

        C.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        C1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        C1.setText("1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        C2.setText("2");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        C3.setText("3");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        C6.setText("6");
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        C5.setText("5");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        C4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        C4.setText("4");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        C7.setText("7");
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        C8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        C8.setText("8");
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        C9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        C9.setText("9");
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DigitosLayout = new javax.swing.GroupLayout(Digitos);
        Digitos.setLayout(DigitosLayout);
        DigitosLayout.setHorizontalGroup(
            DigitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(DigitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DigitosLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(DigitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DigitosLayout.createSequentialGroup()
                            .addComponent(C4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C6))
                        .addGroup(DigitosLayout.createSequentialGroup()
                            .addGroup(DigitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(DigitosLayout.createSequentialGroup()
                                    .addComponent(C1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(C2))
                                .addGroup(DigitosLayout.createSequentialGroup()
                                    .addComponent(C)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(C0)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(DigitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(C3)
                                .addComponent(C10)))
                        .addGroup(DigitosLayout.createSequentialGroup()
                            .addComponent(C7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C9)))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        DigitosLayout.setVerticalGroup(
            DigitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
            .addGroup(DigitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DigitosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(DigitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(C7)
                        .addComponent(C8)
                        .addComponent(C9))
                    .addGap(9, 9, 9)
                    .addGroup(DigitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(C4)
                        .addComponent(C5)
                        .addComponent(C6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(DigitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(C1)
                        .addComponent(C2)
                        .addComponent(C3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(DigitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(C)
                        .addComponent(C0)
                        .addComponent(C10))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Operadores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        division.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        division.setText("÷");
        division.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        suma.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        producto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        producto.setText("x");
        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });

        resta.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        resultado.setBackground(new java.awt.Color(173, 216, 230));
        resultado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        resultado.setText("=");
        resultado.setToolTipText("");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        raiz.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        raiz.setText("√");
        raiz.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });

        elevado.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        elevado.setText("^");
        elevado.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        elevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OperadoresLayout = new javax.swing.GroupLayout(Operadores);
        Operadores.setLayout(OperadoresLayout);
        OperadoresLayout.setHorizontalGroup(
            OperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OperadoresLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(OperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OperadoresLayout.createSequentialGroup()
                        .addComponent(elevado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(producto))
                    .addComponent(raiz))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(OperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(OperadoresLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(OperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(division, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OperadoresLayout.createSequentialGroup()
                            .addComponent(resultado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(OperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(resta)
                                .addComponent(suma))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        OperadoresLayout.setVerticalGroup(
            OperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OperadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(raiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elevado)
                    .addComponent(producto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(OperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(OperadoresLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(division)
                    .addGap(43, 43, 43)
                    .addComponent(resta)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(OperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resultado)
                        .addComponent(suma))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Salir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        n2.setBackground(new java.awt.Color(244, 244, 244));
        n2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        n2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n2.setEnabled(false);
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        n1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n1.setEnabled(false);
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n1)
                    .addComponent(n2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(Digitos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Operadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Operadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Digitos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed

    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed

    }//GEN-LAST:event_n2ActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        n1.setText("");
        n2.setText("");
        num1 = 0;
        num2 = 0;
        aux = "";
        operacion = false;
        res = -1;
    }//GEN-LAST:event_CActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        operacion = true;
        try {
            if (operacion) {
                if (!aux.equalsIgnoreCase("")) {
                    num1 = Double.parseDouble(aux);
                }

                n1.setText(Double.toString(num1) + " - ");
                n2.setText("");
                aux = "";
                control = 2;
            }
        } catch (NumberFormatException e) {
            n1.setText("Error");
            n2.setText("Error");
            num1 = 0;
            num2 = 0;
            aux = "";
            operacion = false;
            res = -1;
        }


    }//GEN-LAST:event_restaActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        operacion = true;
        try {
            if (operacion) {
                if (!aux.equalsIgnoreCase("")) {
                    num1 = Double.parseDouble(aux);
                }

                n1.setText(Double.toString(num1) + " ÷ ");
                n2.setText("");
                aux = "";
                control = 4;
            }
        } catch (NumberFormatException e) {
            n1.setText("Error");
            n2.setText("Error");
            num1 = 0;
            num2 = 0;
            aux = "";
            operacion = false;
            res = -1;
        }

    }//GEN-LAST:event_divisionActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        try {
            if (aux.equalsIgnoreCase("")) {
                n1.setText(Double.toString(num1));
                n2.setText("");
            } else {
                num2 = Double.parseDouble(aux);
                aux = "";
                switch (control) {
                    case 1:
                        n1.setText(Double.toString(num1) + " + " + Double.toString(num2));
                        res = num1 + num2;
                        n2.setText(Double.toString(res));
                        num1 = res;
                        num2 = 0;

                        break;
                    case 2:
                        n1.setText(Double.toString(num1) + " - " + Double.toString(num2));
                        res = num1 - num2;
                        n2.setText(Double.toString(res));
                        num1 = res;
                        num2 = 0;

                        break;
                    case 3:
                        n1.setText(Double.toString(num1) + " x " + Double.toString(num2));
                        res = num1 * num2;
                        n2.setText(Double.toString(res));
                        num1 = res;
                        num2 = 0;

                        break;
                    case 4:
                        //No puedo capturar la exception de dividir entre 0 porque estoy usando numeros doubles y no salta exception con ellos asi 
                        //lo controlo con un if
                        if (num2 != 0) {
                            n1.setText(Double.toString(num1) + " ÷ " + Double.toString(num2));
                            res = num1 / num2;
                            n2.setText(Double.toString(res));
                            num1 = res;
                            num2 = 0;

                        } else {
                            n1.setText(Double.toString(num1) + " ÷ " + Double.toString(num2));
                            n2.setText("MathError");
                            num1 = 0;
                            num2 = 0;
                        }
                        break;
                    default:
                }
            }
        } catch (NumberFormatException e) {
            n1.setText("Error");
            n2.setText("Error");
            num1 = 0;
            num2 = 0;
            aux = "";
            operacion = false;
            res = -1;
        }


    }//GEN-LAST:event_resultadoActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        operacion = true;
        try {
            if (operacion) {
                if (!aux.equalsIgnoreCase("")) {
                    num1 = Double.parseDouble(aux);
                }

                n1.setText(Double.toString(num1) + " + ");
                n2.setText("");
                aux = "";
                control = 1;
            }
        } catch (NumberFormatException e) {
            n1.setText("Error");
            n2.setText("Error");
            num1 = 0;
            num2 = 0;
            aux = "";
            operacion = false;
            res = -1;
        }


    }//GEN-LAST:event_sumaActionPerformed

    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed
        operacion = true;
        try {
            if (operacion) {
                if (!aux.equalsIgnoreCase("")) {
                    num1 = Double.parseDouble(aux);
                }

                n1.setText(Double.toString(num1) + " x ");
                n2.setText("");
                aux = "";
                control = 3;
            }
        } catch (NumberFormatException e) {
            n1.setText("Error");
            n2.setText("Error");
            num1 = 0;
            num2 = 0;
            aux = "";
            operacion = false;
            res = -1;
        }

    }//GEN-LAST:event_productoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        operacion = false;
        if (!operacion) {
            aux += "7";
            n2.setText(aux);
        }
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        operacion = false;
        if (!operacion) {
            aux += "8";
            n2.setText(aux);
        }
    }//GEN-LAST:event_C8ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        operacion = false;
        if (!operacion) {
            aux += "9";
            n2.setText(aux);
        }
    }//GEN-LAST:event_C9ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        operacion = false;
        if (!operacion) {
            aux += "4";
            n2.setText(aux);
        }
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        operacion = false;
        if (!operacion) {
            aux += "5";
            n2.setText(aux);
        }
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        operacion = false;
        if (!operacion) {
            aux += "6";
            n2.setText(aux);
        }
    }//GEN-LAST:event_C6ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        operacion = false;
        if (!operacion) {
            aux += "3";
            n2.setText(aux);
        }
    }//GEN-LAST:event_C3ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        operacion = false;
        if (!operacion) {
            aux += "1";
            n2.setText(aux);
        }
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        operacion = false;
        if (!operacion) {
            aux += "2";
            n2.setText(aux);
        }
    }//GEN-LAST:event_C2ActionPerformed

    private void C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C0ActionPerformed
        operacion = false;
        if (!operacion) {
            aux += "0";
            n2.setText(aux);
        }

    }//GEN-LAST:event_C0ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
        operacion = false;
        if (!operacion) {
            aux += ".";
            n2.setText(aux);
        }
    }//GEN-LAST:event_C10ActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        operacion = true;
        //El metodo Math.sqrt() no lanza una exception con numeros negativos asi que lo controlo con un if
        try {
            if (operacion) {
                if (!aux.equalsIgnoreCase("")) {
                    num1 = Double.parseDouble(aux);
                }
                if (num1 > 0) {
                    n1.setText("√" + Double.toString(num1));
                    res = Math.sqrt(num1);
                    n2.setText(Double.toString(res));
                    num1 = res;
                    num2 = 0;
                    aux = "";
                    control = -1;
                } else {
                    n1.setText("√" + Double.toString(num1));
                    n2.setText("Input Number Negative");
                }
            }

        } catch (NumberFormatException e) {
            n1.setText("Error");
            n2.setText("Error");
            num1 = 0;
            num2 = 0;
            aux = "";
            operacion = false;
            res = -1;
        }

    }//GEN-LAST:event_raizActionPerformed

    private void elevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevadoActionPerformed
        try {
            java.awt.Desktop.getDesktop().browse(new java.net.URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        } catch (IOException ex) {
            System.err.println("Ha ocurrido una IOException");
        } catch (java.net.URISyntaxException ex) {
            System.err.println("No ha encontrado la URL");
        }
    }//GEN-LAST:event_elevadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C;
    private javax.swing.JButton C0;
    private javax.swing.JButton C1;
    private javax.swing.JButton C10;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton C9;
    private javax.swing.JPanel Digitos;
    private javax.swing.JPanel Operadores;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Salir;
    private javax.swing.JButton division;
    private javax.swing.JButton elevado;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JButton producto;
    private javax.swing.JButton raiz;
    private javax.swing.JButton resta;
    private javax.swing.JButton resultado;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
