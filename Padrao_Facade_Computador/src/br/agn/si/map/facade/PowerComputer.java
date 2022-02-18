package br.agn.si.map.facade;

public class PowerComputer {
	
	public static void inicializarCpu() {
		Cpu cpu = new Cpu();
		cpu.star();
	}
	
	public static void lerdHd() {
		HardDrive hd = new HardDrive();
		hd.read();
	}
	
	public static void carregarMemoria() {
		Memory memory = new Memory();
		memory.load();
	}
	
	public static void executarCpu() {
		Cpu cpu = new Cpu();
		cpu.execute();
	}
	
	public static void liberarMemoria() {
		Memory memory = new Memory();
		memory.free();
	}
	
	

}
