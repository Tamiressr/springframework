package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter(urlPatterns = "/servletPrincipal") //igual ao servlet garante que todas as requisi??es do service v?o chegar no filter
public class MonitoramentoFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		long antes=System.currentTimeMillis();
		String acao= request.getParameter("acao");
		chain.doFilter(request, response);
		
		long depois= System.currentTimeMillis();
		System.out.println("Tempo de Execu??o da acao:"+acao+"-->"+(depois-antes));
		
	}

}
