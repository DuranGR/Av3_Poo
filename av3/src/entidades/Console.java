package entidades;

//Classe Console, ela estende a classe Produto
public class Console extends Produto {

	//Atributos específicos de Console
	private Integer armazenamento;
	private String cor;

	@Override
	public String toString() {
		return "Nome - " + super.getNome() + " Preço(Sem_Imposto/Com_Imposto)"+super.getPreco()+"/"+super.getPreco()*1.25+ super.toString() + "Cor - " + cor + ", Armazenamento - " + armazenamento;
	}

	//Construtor da classe Console
	public Console(Double preco, Integer codigo, String nome, Integer quantidade, Integer armazenamento, String cor) {
		super(preco, codigo, nome, quantidade);
		this.armazenamento = armazenamento;
		this.cor = cor;
	}

	//Metodos Getters e Setters
	public Integer getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(Integer armazenamento) {
		this.armazenamento = armazenamento;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
