import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class MAINPRODUTONOVO {
	public static void main(String[] args) {

		// Criando uma nova instância do produto usando o construtor padrão
		PRODUTONOVO p1 = new PRODUTONOVO();
		p1.setcusto(10);
		p1.setvenda(15);
		p1.setNome("Leite");
		// Criando uma instância de Calendar para definir a data de fabricação do
		// produto
		Calendar dt_fabricacao = Calendar.getInstance();
		// Configurando a data de fabricação para 15 de novembro de 2024
		dt_fabricacao.set(2024, Calendar.NOVEMBER, 15);
		p1.setdt_fabricacao(dt_fabricacao);

		// Criando um formatador de data para exibir as datas no formato "dd/MM/yyyy"
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		// Exibindo as informações
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Preço de venda: " + p1.getvenda());
		System.out.println("Preço de custo: " + p1.getcusto());
		System.out.println("Data de fabricação: " + dateFormat.format(p1.getdt_fabricacao().getTime())); // Exibe a data
																											// de
																											// fabricação
		System.out.println("Data de validade: " + dateFormat.format(p1.getdt_validade().getTime())); // Exibe a data de
																										// validade,
																										// calculada com
																										// base na data
																										// de fabricação

	}
}
