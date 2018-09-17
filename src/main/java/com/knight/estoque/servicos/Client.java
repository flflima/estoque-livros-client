package com.knight.estoque.servicos;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		// Inicia a fábrica dos proxies
		final ListagemLivrosService listagemLivrosFactory = new ListagemLivrosService();
		
		// Obtém um proxy
		final ListagemLivros listagemLivros = listagemLivrosFactory.getListagemLivrosPort();

		// Executa o método remoto
		final List<Livro> livros = listagemLivros.listarLivros();
		for (Livro livro : livros) {
			System.out.println("Nome: " + livro.getNome());
		}
	}
}