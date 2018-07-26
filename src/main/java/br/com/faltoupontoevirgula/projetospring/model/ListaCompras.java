package br.com.faltoupontoevirgula.projetospring.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class ListaCompras implements Serializable {
	
	private Date data = new Date();
	private List<ItemListaCompra> itens = new ArrayList<ItemListaCompra>();
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public List<ItemListaCompra> getItens() {
		return itens;
	}
	public void setItens(List<ItemListaCompra> itens) {
		this.itens = itens;
	}
}
