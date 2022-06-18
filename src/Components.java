public abstract class Components {
    // Computer Components
    protected String[] components = {"Processors", "Motherboard", "GPU", "RAM", "HDD/SDD", "CPU Cooler", "Monitors", "Mouse", "Keyboard", "Headphone / Speaker", "Cart List (Checkout)", "Exit"};
    protected String[] adminComponents = {"Processors", "Motherboard", "GPU", "RAM", "HDD/SDD", "CPU Cooler", "Monitors", "Mouse", "Keyboard", "Headphone / Speaker", "Exit"};

    // Processor (CPU)
    protected String[][] cpuList = {
        {"I9-1200", "INTEL", "12", "9400"},
        {"I3-10100F", "INTEL", "54", "4000"},
        {"I7-10700", "RYZEN", "14", "7500"}
    };
    
    // Motherboard
    protected String[][] motherboardList = { 
        {"B450-5500", "G.B", "23", "3400"},
        {"B450 II", "MSI", "17", "4000"},
        {"B450M-Pro", "ASUS", "21", "8500"}
    };

    // Graphics Card (GPU)
    protected String[][] gpuList = {
        {"GT1030", "MSI", "42", "5400"},
        {"GTX 1650", "ASUS", "16", "12000"},
        {"6700XT", "MSI", "6", "25000"}
    };
    
    // Memory (RAM)
    protected String[][] ramList = {
        {"Vengnc 2x8", "CRSR", "42", "5000"},
        {"FuryB 2x16", "KNGTN", "53", "6000"},
        {"XPG 2x16", "ADATA", "21", "7000"}
    };

    // HDD AND SSD (STORAGE)
    protected String[][] storageList = {
        {"2TB M.2", "SMSNG", "70", "5000"},
        {"240GB 2.5", "G.B", "56", "6000"},
        {"1TB 3.5", "SGT", "74", "7000"} 
    };

    // CPU Coolers
    protected String[][] cpuCoolerList = {
        {"AS500 Plus", "DPCL", "27", "5000"},
        {"L240 V2", "DPCL", "31", "6000"},
        {"H60 V2", "DPCL", "24", "7000"}
    };

    // Monitors
    protected String[][] monitorList = {
        {"PG279QM", "ASUS", "14", "5000"},
        {"U2723QE", "DELL", "16", "6000"},
        {"MAG274QRF", "MSI", "18", "7000"}
    };

    // Mouse
    protected String[][] mouseList = {
        {"Basilik V3", "RAZER", "51", "5000"},
        {"G502", "LGTCH", "41", "6000"},
        {"Katar Pro", "CRSR", "43", "7000"}
    };

    // Keyboard
    protected String[][] keyboardList = {
        {"K100 RGB", "CRSR", "34", "5000"},
        {"G915", "LGTCH", "22", "6000"},
        {"Everest", "MNTN", "36", "7000"}
    };

    // Headpones and Speaker
    protected String[][] headponesAndSpeakersList = {
        {"Black.S V2", "RAZER", "45", "5000"},
        {"HyperX C.A", "HYPRX", "39", "6000"},
        {"G560", "LGTCH", "34", "7000"}
    };
}