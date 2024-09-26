import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class PRODUTONOVO {
	// Atributos
	public String Nome;
	public double custo;
	public double venda;
	public Calendar dt_fabricacao; // Data em que o produto foi fabricado
	public Calendar dt_validade; // Data de validade do produto

	// Construtor padrão que não inicializa atributos
	public PRODUTONOVO() {
	}

	// Construtor que recebe todos os atributos do produto
	public PRODUTONOVO(String Nome, double custo, double venda, Calendar dt_fabricacao, Calendar dt_validade) {
		this.dt_fabricacao = dt_fabricacao;
		this.Nome = Nome;
		this.dt_validade = dt_validade;
		this.custo = custo;
		this.venda = venda;
	}

	// Construtor que recebe nome, custo e venda e data de fabricação
	public PRODUTONOVO(String Nome, float custo, float venda, Calendar dt_fabricacao) {
		this.Nome = Nome;
		this.custo = custo;
		this.venda = venda;
		this.dt_fabricacao = dt_fabricacao;
		// Calcula a data de validade como 1 mês após a data de fabricação
		this.dt_validade = (Calendar) dt_fabricacao.clone(); // Clona a data de fabricação
		this.dt_validade.add(Calendar.MONTH, 1); // Adiciona 1 mês à data de fabricação
	}

	// Construtor que permite criar um produto com nome e custo, com preço de venda
	// calculado
	public PRODUTONOVO(String Nome, double custo) {
		this.Nome = Nome;
		this.custo = custo;
		this.venda = custo * 1.1; // Define o preço de venda como 10% a mais que o custo

		// Inicializa a data de validade para 1 mês após a data de fabricação
		this.dt_validade = (Calendar) dt_fabricacao.clone(); // Clona a data de fabricação
		this.dt_validade.add(Calendar.MONTH, 1); // Adiciona 1 mês à data de fabricação
	}

	// Métodos getters (Método que retorna o valor do produto) e setters (Método que
	// permite alterar o valor do produto)

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public double getcusto() {
		return custo;
	}

	public void setvenda(double venda) {
		this.venda = venda;
	}

	public void setcusto(double custo) {
		this.custo = custo;
	}

	public double getvenda() {
		return venda;
	}

	// Método que permite alterar a data de fabricação do produto
	public void setdt_fabricacao(Calendar dt_fabricacao) {
		this.dt_fabricacao = dt_fabricacao; // Atualiza a data de fabricação

		// Atualiza a validade sempre que a data de fabricação é alterada
		this.dt_validade = (Calendar) dt_fabricacao.clone(); // Clona a nova data de fabricação
		this.dt_validade.add(Calendar.MONTH, 1); // Adiciona 1 mês à nova data de fabricação
	}

	// Método que retorna a data de fabricação do produto
	public Calendar getdt_fabricacao() {
		return dt_fabricacao; // Retorna a data de fabricação armazenada
	}

	// Método que permite alterar a data de validade do produto
	public void setdt_validade(Calendar dt_validade) {
		this.dt_validade = dt_validade; // Atualiza a data de validade
	}

	// Método que retorna a data de validade do produto
	public Calendar getdt_validade() {
		return dt_validade; // Retorna a data de validade armazenada
	}
}
