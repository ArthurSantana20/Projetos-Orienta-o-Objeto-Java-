package br.com.aula4.implementação;

import br.com.aula4.beans.Banco;
import br.com.aula4.beans.Cliente;
import br.com.aula4.beans.Corrente;
import br.com.aula4.beans.Poupanca;

public class ExecutarContaBancaria {
    public static void main(String[] args) throws br.com.aula4.excecao.MeuException, br.com.aula4.excecao.MeuException {

        Cliente cliente1=new Cliente("Arthur","489350498-32","11932000278");
        Banco itau=new Banco("Bradesco",5);
        Corrente cc1=new Corrente(2,1010,10101,cliente1,itau,0,10);
        System.out.println("Dados bancarios");
        System.out.println(cc1.extrato());
        cc1.definirLimite(1000);
        System.out.println(cc1.extrato());

        Poupanca pp=new Poupanca(2,1010,1500,cliente1,itau,0);
        pp.setRendimento(10);
        System.out.println(pp.extrato());
        System.out.println("Creditar rendimento" + pp.creditarRendimento());
        System.out.println(pp.extrato());

        System.out.println("SAQUE poupança(1.000)=" + pp.saque(1000));
        System.out.println("SAQUE corrente(1.000)=" + cc1.saque(1000));

        //Método JOption:
        /*
        Banco b1=new Banco(EntradaTela.texto("Qual o banco?"),EntradaTela.inteiro("Qual o id do banco?"));
        Cliente c1=new Cliente(EntradaTela.texto("Digite seu nome:"),EntradaTela.texto("Digite aqui seu CPF:"),EntradaTela.texto("Digite aqui seu numero:"));
        ContaBancaria p1=new ContaBancaria(EntradaTela.inteiro("Diga o numero da conta bancaria:"),EntradaTela.inteiro("Diga agora,a agencia:"),
                EntradaTela.decimal("Digite o saldo da conta:"),EntradaTela.decimal("Digite aqui o seu limite:"),EntradaTela.texto("Qual o tipo de conta?"),c1,b1);
        System.out.println(p1.extrato());
         */
    }
}