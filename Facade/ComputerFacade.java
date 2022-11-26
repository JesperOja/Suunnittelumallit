package Facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hd;

    public ComputerFacade(){
        cpu = new CPU();
        memory = new Memory();
        hd = new HardDrive();
    }

    public void start(){
        cpu.Freeze();
        memory.Load(1, hd.Read(45, 880));
        memory.Load(13, hd.Read(74, 48));
        memory.Load(45, hd.Read(22, 8118));
        memory.Load(66, hd.Read(4555, 832));
        memory.Load(11, hd.Read(87, 8));
        cpu.Jump(memory.getMap());
        cpu.Execute();
    }
}
