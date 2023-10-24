package entities;

abstract class PersonAbstract  {
	private String name;
	private String address;
	private Double phone;
	private Double cpf;
	private Double cell;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String adress) {
		this.address = adress;
	}


	public Double getPhone() {
		return phone;
	}


	public void setPhone(Double phone) {
		this.phone = phone;
	}


	public Double getCpf() {
		return cpf;
	}


	public void setCpf(Double cpf) {
		this.cpf = cpf;
	}


	public Double getCell() {
		return cell;
	}


	public void setCell(Double cell) {
		this.cell = cell;
	}

}
