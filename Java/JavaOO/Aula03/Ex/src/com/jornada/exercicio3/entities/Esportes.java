package com.jornada.exercicio3.entities;

public enum Esportes {
    FUTEBOL("Futebol", "O futebol é o esporte coletivo mais praticado do mundo. É disputado por duas equipes,\n" +
            "de 11 jogadores que têm como objetivo colocar a bola entre as traves adversárias o maior número de \n" +
            "vezes sem usar mãos e braços."),
    BASQUETE("Basquete", "É disputado por duas equipes de 12 jogadores (5 em campo e 7 suplentes) que têm\n" +
            "como objetivo passar a bola por dentro de um cesto e evitar que a bola entre no seu cesto colocado nas \n" +
            "extremidades da quadra, seja num ginásio ou ao ar livre."),
    NATACAO("Natação", " A natação é uma atividade física que pode ser, de maneira simultânea, útil e \n" +
            "recreativa. As suas principais utilizações são recreativas, balneares, pesca, exercício e desporto."),
    JIUJITSU("Jiu-Jitsu", "Jiu-Jitsu é uma arte marcial que utiliza técnicas de luta no chão."),
    VOLEI("Vôlei", " é um esporte praticado numa quadra dividida em duas partes por uma rede, possuindo \n" +
            "duas equipes de seis jogadores em cada lado"),
    CROSSFIT("CrossFit", "O CrossFit é um programa de força e condicionamento que consiste principalmente\n" +
            "em uma mistura de exercícios aeróbicos, exercícios de calistenia e levantamento de peso olímpico");

    /*Por o ENUM ser uma Constante o java sugere que utilizamos o final para impedir
    que os valores nome e descrição sejam Alterados.*/
    private final String nome;
    private final String descricao;

    Esportes(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
}
