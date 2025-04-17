package br.com.brunoedubems;

import br.com.brunoedubems.dto.MoedaDto;
import br.com.brunoedubems.service.Apiservice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String key = "af377eff959eb33368e9f791";
        Apiservice apiservice = new Apiservice();

        while (true){
            System.out.println("**********************************************");
            System.out.println("Seja bem-vindo(a) ao Conversor de Moeda da One");
            System.out.println("1) Dólar =>>  Peso argentino");
            System.out.println("2) Peso argentino =>>  Dólar");
            System.out.println("3) Dólar =>>  Real brasileiro");
            System.out.println("4) Real brasileiro =>>  Dólar");
            System.out.println("5) Dólar =>>  Peso colombiano");
            System.out.println("6) Peso colombiano =>>  Dólar");
            System.out.println("7) Sair");
            System.out.println("**********************************************");
            System.out.print("Digite a opção que queira transformar: ");
             String opcao = leitura.nextLine();

            if (opcao.equals("7")){
                System.out.println("Saindo do programa...");
                break;
            }

            String tipoDaConversao;
            switch (opcao) {
                case "1":
                    tipoDaConversao = "USD/ARS/";
                    break;
                case "2":
                    tipoDaConversao = "ARS/USD/";
                    break;
                case "3":
                    tipoDaConversao = "USD/BRL/";
                    break;
                case "4":
                    tipoDaConversao = "BRL/USD/";
                    break;
                case "5":
                    tipoDaConversao = "USD/COP/";
                    break;
                case "6":
                    tipoDaConversao = "COP/USD/";
                    break;
                default:
                    System.out.println("Digite um valor válido! De 1 a 7");
                    continue;
            }

            try {
                System.out.print("Digite o valor para conversão: ");
                double valorDeConversao = leitura.nextDouble();
                leitura.nextLine();

                MoedaDto resultado = apiservice.getMoeda(key,tipoDaConversao,valorDeConversao);
                    System.out.println("O valor de " + valorDeConversao + "[" + resultado.base_code()+ "] corresponde ao valor final de ==>>> "+ resultado.conversion_result() + "["+ resultado.target_code() + "]");
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Certifique-se de digitar um número.");
                leitura.nextLine();
            } catch (Exception e) {
                System.out.println("### ERROR ### - Digite um valor válido para converter ");
            }

        }
        leitura.close();
    }
}