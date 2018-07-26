package br.com.faltoupontoevirgula.projetospring.model;

import java.io.Serializable;

public class ItemListaCompra implements Serializable{
	private Produto produto = new Produto();
	private int quantidade;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
