package fabricadeautomoveis;


import javax.swing.JOptionPane;

public class FabricaDeAutomoveis {

    public static void main(String[] args) {
        Caracteristicas carro1 = new Caracteristicas();
        int opcao = 0;
        String frase = "Número Inválido";
        while (opcao != 7) {

            String menuInformado = JOptionPane.showInputDialog("Escolha as caracteristicas do seu veiculo \n 1 - Potência do Motor \n 2 - Cores \n 3 - Quantida de portas \n 4 - Câmbio \n 5 - Modelo \n 6 - Tipo de direção \n 7 - SAIR");
            opcao = Integer.parseInt(menuInformado);
            switch (opcao) {
                case 1: {
                    String pontenciaInformada = JOptionPane.showInputDialog("Informe a potência entre 1.0 - 2.2");
                    double potencia = Double.parseDouble(pontenciaInformada);
                    if ((potencia < 1.0) || (potencia > 2.2)) {
                        System.out.println("Potência Invalida");
                    } else {
                        carro1.potenciaDoMotor = potencia;
                    }
                    break;
                }

                case 2: {
                    String corInformada = JOptionPane.showInputDialog("Informe a cor desejada \n 1 - Azul \n 2- Vermelho \n 3 - Amarelo \n 4 - Preto \n 5 - Branco");
                    int corSelecionada = Integer.parseInt(corInformada);
                    switch (corSelecionada) {
                        case 1:
                            carro1.cores = "Azul";break;
                        case 2:
                            carro1.cores = "Vermelho";break;
                        case 3:
                            carro1.cores = "Amarelo";break;
                        case 4:
                            carro1.cores = "Preto";break;
                        case 5:
                            carro1.cores = "Branco";break;
                        default:
                            System.out.println(frase);
                    }
                    

                }break;

                case 3: {
                    String portasInformadas = JOptionPane.showInputDialog("Informe o número de portas \n 1 - 2 Portas \n 2 - 4 Portas");
                    int numPortas = Integer.parseInt(portasInformadas);
                    switch (numPortas) {
                        case 1:
                            carro1.portas = 2;break;
                        case 2:
                            carro1.portas = 4;break;
                        default:
                            System.out.println(frase);
                    }
                    
                }break;
                case 4: {
                    String cambioInformado = JOptionPane.showInputDialog("Informe o Câmbio \n 1 - Manual \n 2 - Automatico");
                    int cambioDesejado = Integer.parseInt(cambioInformado);
                    switch (cambioDesejado) {
                        case 1:
                            carro1.cambio = "Manual";break;
                        case 2:
                            carro1.cambio = "Automatico";break;
                        default:
                            System.out.println(frase);
                    }
                }break;
                case 5: {
                    String modeloInformado = JOptionPane.showInputDialog("Infomre o modelo \n 1 - Palio \n 2 - Uno  \n 3 - Siena \n 4 - Bravo \n 5 - 500 \n 6 - Idea");
                    int modeloSelecionado = Integer.parseInt(modeloInformado);
                    switch (modeloSelecionado) {
                        case 1:
                            carro1.modelo = "Palio";break;
                        case 2:
                            carro1.modelo = "Uno";break;
                        case 3:
                            carro1.modelo = "Siena";break;
                        case 4:
                            carro1.modelo = "Bravo";break;
                        case 5:
                            carro1.modelo = "500";break;
                        case 6:
                            carro1.modelo = "Idea";break;
                        default:
                            System.out.println(frase);
                    }
                    break;
                }
                case 6: {
                    String direcaoInformada = JOptionPane.showInputDialog("Informe o tipo de direção \n 1 - Hidráulica \n 2 - Elétrica");
                    int direcaoDesejada = Integer.parseInt(direcaoInformada);
                    switch (direcaoDesejada) {
                        case 1:
                            carro1.direcao = "Hidráulica";break;
                        case 2:
                            carro1.direcao = "Elétrica";break;
                        default:
                            System.out.println(frase);
                    }
                    
                }break;
                case 7:
                    System.out.println("Saindo...");break;
                default:
                    System.out.println(frase);

            }
        }

        String resultado = null;
        resultado = resultado + "Motor: " + String.valueOf(carro1.potenciaDoMotor) + "\n Cor: " + String.valueOf(carro1.cores) + "\n Portas: " + String.valueOf(carro1.portas) + "\n Câmbio: " + String.valueOf(carro1.cambio) + "\n Modelo: " + String.valueOf(carro1.modelo) + "\n Direção: " + String.valueOf(carro1.direcao);
     
        JOptionPane.showMessageDialog(null, (resultado));
    }

}
