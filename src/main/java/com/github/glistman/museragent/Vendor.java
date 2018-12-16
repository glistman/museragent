package com.github.glistman.museragent;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Vendor {

    private static String BLACKBERRY = "BlackBerry";
    private static String NOKIA = "Nokia";
    private static String HTC = "HTC";
    private static String MOTOROLA = "Motorola";
    private static String HUAWEI = "Huawei";
    private static String AZUMI = "Azumi";
    private static String MINT = "Mint";
    private static String XIAOMI = "Xiaomi";
    private static String ZTE = "ZTE";
    private static String SONY = "Sony";
    private static String HEWLETT_PACKARD = "Hewlett Packard";
    private static String NEXT = "Next";
    private static String IMC = "IMC";
    private static String YXTEL = "YXTEL";
    private static String BLU = "BLU";
    private static String BLUBOO = "Bluboo";
    private static String BQ = "BQ";
    private static String BLUMIX = "BLUMIX ";
    private static String COMPUMAX = "COMPUMAX";
    private static String BlueStacks = "BlueStacks";
    private static String UMI = "UMI";
    private static String LENOVO = "Lenovo";
    private static String ASUS = "ASUS";
    private static String SAMSUNG = "SAMSUNG";
    private static String ONEPLUS = "ONEPLUS";
    private static String ALCATEL = "Alcatel";
    private static String AVVIO = "Avvio";
    private static String INFINIX = "Infinix";
    private static String LOGIC = "LOGIC";
    private static String VERYKOOL = "Verykool";
    private static String IPRO = "iPro";
    private static String SKY = "SKY";
    private static String BMOBILE = "Bmobile";
    private static String VIVO = "Vivo";
    private static String VERNEE = "Vernee";
    private static String WILEYFOX = "Wileyfox";
    private static String AFFIX = "Affix";
    private static String AQUA = "Aqua";
    private static String NEFFOS = "Neffos";
    private static String GOOGLE = "Google";
    private static String LG = "LG";
    private static String SUPERSONIC = "Supersonic";
    private static String LANIX = "Lanix";
    private static String MOVIC = "Movic";
    private static String MOFI = "Mofi";
    private static String HYUNDAI = "Hyundai";
    private static String WIKO = "Wiko";
    private static String MEIZU = "MEIZU";
    private static String PANASONIC = "Panasonic";
    private static String OPPO = "Oppo";
    private static String DOOGEE = "DOOGEE";
    private static String LEECO = "LeEco";
    private static String OUKITEL = "Oukitel";
    private static String OWN = "Own";
    private static String NOBLEX = "NOBLEX";
    private static String KINGO = "Kingo";
    private static String EKO = "EKO";
    private static String DAEWOO = "Daewoo";
    private static String MICROMAX = "Micromax";
    private static String BLACKVIEW = "Blackview";
    private static String TECNO = "TECNO";
    private static String ELEPHONE = "Elephone";
    private static String UFO = "UFO";
    private static String VODAFONE = "Vodafone";
    private static String NEOS = "NEOS";
    private static String PHILIPSS = "Philipss";
    private static String ENERGY_SISTEM = "Energy Sistem";
    private static String MAXWEST = "Maxwest";
    private static String WIAM = "WIAM";
    private static String WISE = "Wise";
    private static String HISENSE = "Hisense";


    private List<VendorPattern> vendorPatterns = Arrays.asList(
            new VendorPattern("^BBA.*", BLACKBERRY),
            new VendorPattern("^z10.*", BLACKBERRY),
            new VendorPattern("^STV100-3.*", BLACKBERRY),
            new VendorPattern("^Lumia.*", NOKIA),
            new VendorPattern("^.*Nokia.*", NOKIA),
            new VendorPattern("^XL-103Q.*", NOKIA),
            new VendorPattern("^TA-.*", NOKIA),
            new VendorPattern("^2PQ93", HTC),
            new VendorPattern("^HTC.*", HTC),
            new VendorPattern("^T737", HTC),
            new VendorPattern("^2PQ93.*", HTC),
            new VendorPattern("^0PJA2.*", HTC),
            new VendorPattern("^XT.*", MOTOROLA),
            new VendorPattern("^moto.*", MOTOROLA),
            new VendorPattern("^lineage.*", MOTOROLA),
            new VendorPattern("^DROID4.*", MOTOROLA),
            new VendorPattern("^BND-L24", HUAWEI),
            new VendorPattern("^BLN-.*", HUAWEI),
            new VendorPattern("^p\\d\\s.*", HUAWEI),
            new VendorPattern("^CLT-.*", HUAWEI),
            new VendorPattern("^PH-1.*", HUAWEI),
            new VendorPattern("^Orange Gova.*", HUAWEI),
            new VendorPattern("^JSN-.*", HUAWEI),
            new VendorPattern("^Che2-UL00.*", HUAWEI),
            new VendorPattern("^ATH-.*", HUAWEI),
            new VendorPattern("^Ascend.*", HUAWEI),
            new VendorPattern("^.*Huawei.*", HUAWEI),
            new VendorPattern("^RNE-L23", HUAWEI),
            new VendorPattern("^Azumi.*", AZUMI),
            new VendorPattern("^A50C\\+.*", AZUMI),
            new VendorPattern("^mint.*", MINT),
            new VendorPattern("^Mi.*", XIAOMI),
            new VendorPattern("^.*MIUI.*", XIAOMI),
            new VendorPattern("^MIX.*", XIAOMI),
            new VendorPattern("^.*Redmi.*", XIAOMI),
            new VendorPattern("^2014819.*", XIAOMI),
            new VendorPattern("^PRO\\s\\d.*", XIAOMI),
            new VendorPattern("^ZTE.*", ZTE),
            new VendorPattern("^BLADE.*", ZTE),
            new VendorPattern("^Grand X.*", ZTE),
            new VendorPattern("^Savvy.*", ZTE),
            new VendorPattern("^Z98\\d.*", ZTE),
            new VendorPattern("^C\\d{4,}\\s*", SONY),
            new VendorPattern("^D\\d{4,}\\s*$", SONY),
            new VendorPattern("^E\\d{4,}\\s*$", SONY),
            new VendorPattern("^F\\d{4,}\\s*$", SONY),
            new VendorPattern("^G\\d{4,}\\s*$", SONY),
            new VendorPattern("^H\\d{4,}\\s*$", SONY),
            new VendorPattern("^D\\d{4,}\\s.*", SONY),
            new VendorPattern("^E\\d{4,}\\s.*", SONY),
            new VendorPattern("^F\\d{4,}\\s.*", SONY),
            new VendorPattern("^G\\d{4,}\\s.*", SONY),
            new VendorPattern("^H\\d{4,}\\s.*", SONY),
            new VendorPattern("^XT1.*", SONY),
            new VendorPattern("^Xperia.*", SONY),
            new VendorPattern("^.*Sony.*", SONY),
            new VendorPattern("^.*M4-AQUA.*", SONY),
            new VendorPattern("^HP", HEWLETT_PACKARD),
            new VendorPattern("^HP\\s+.*", HEWLETT_PACKARD),
            new VendorPattern("^Next", NEXT),
            new VendorPattern("^ROAD.*", IMC),
            new VendorPattern("^YXTEL.*", YXTEL),
            new VendorPattern("^Tank.*", BLU),
            new VendorPattern("^BLU\\s+.*", BLU),
            new VendorPattern("^BLU_.*", BLU),
            new VendorPattern("^.*PURE XL.*", BLU),
            new VendorPattern("^Grand M.*", BLU),
            new VendorPattern("^Neo.*", BLU),
            new VendorPattern("^Studio.*", BLU),
            new VendorPattern("^.*Advance 4.0M.*", BLU),
            new VendorPattern("^Xtouch", BLUBOO),
            new VendorPattern("^Bluboo.*", BLUBOO),
            new VendorPattern("^Aquaris.*", BQ),
            new VendorPattern("^BLUMIX.*", BLUMIX),
            new VendorPattern("^blue.*", COMPUMAX),
            new VendorPattern("^BlueStacks", BlueStacks),
            new VendorPattern("^ROME_X.*", UMI),
            new VendorPattern("^UMI.*", UMI),
            new VendorPattern("^Lenovo.*", LENOVO),
            new VendorPattern("^Vibe.*", LENOVO),
            new VendorPattern("^.*A6020.*", LENOVO),
            new VendorPattern("^ASUS.*", ASUS),
            new VendorPattern("^^GT-.*", SAMSUNG),
            new VendorPattern("^.*SAMSUNG.*", SAMSUNG),
            new VendorPattern("^.*Galaxy.*", SAMSUNG),
            new VendorPattern("^Note.*", SAMSUNG),
            new VendorPattern("^SGH-.*", SAMSUNG),
            new VendorPattern("^SC-.*", SAMSUNG),
            new VendorPattern("^SM-.*", SAMSUNG),
            new VendorPattern("^N9106.*", SAMSUNG),
            new VendorPattern("^SPH-.*", SAMSUNG),
            new VendorPattern("^Galax.*", SAMSUNG),
            new VendorPattern("^A8.*", SAMSUNG),
            new VendorPattern("^ONEPLUS.*", ONEPLUS),
            new VendorPattern("^ONE A2005", ONEPLUS),
            new VendorPattern("^A0001.*", ONEPLUS),
            new VendorPattern("^Alcatel.*", ALCATEL),
            new VendorPattern("^5016J.*", ALCATEL),
            new VendorPattern("^4049G.*", ALCATEL),
            new VendorPattern("^6045I.*", ALCATEL),
            new VendorPattern("^Orange Nura.*", ALCATEL),
            new VendorPattern("^ONE TOUCH.*", ALCATEL),
            new VendorPattern("^Avvio.*", AVVIO),
            new VendorPattern("^Infinix.*", INFINIX),
            new VendorPattern("^LOGIC.*", LOGIC),
            new VendorPattern("^.*Verykool.*", VERYKOOL),
            new VendorPattern("^Kylin.*", IPRO),
            new VendorPattern("^WAVE.*", IPRO),
            new VendorPattern("^.*iPro.*", IPRO),
            new VendorPattern("^.*SKY.*", SKY),
            new VendorPattern("^Bmobile.*", BMOBILE),
            new VendorPattern("^vivo.*", VIVO),
            new VendorPattern("^Apollo Lite.*", VERNEE),
            new VendorPattern("^Swift 2.*", WILEYFOX),
            new VendorPattern("^.*Aquarius.*", AFFIX),
            new VendorPattern("^Aqua", AQUA),
            new VendorPattern("^Neffos.*", NEFFOS),
            new VendorPattern("^Google.*", GOOGLE),
            new VendorPattern("^Nexus.*", GOOGLE),
            new VendorPattern("^Pixel.*", GOOGLE),
            new VendorPattern("^LG.*", LG),
            new VendorPattern("^LGL.*", LG),
            new VendorPattern("^LGM.*", LG),
            new VendorPattern("^G\\d\\s.*", LG),
            new VendorPattern("^VS\\d{3}.*", LG),
            new VendorPattern("^SV-.*", SUPERSONIC),
            new VendorPattern("^ILIUM.*", LANIX),
            new VendorPattern("^MOVIC-.*", MOVIC),
            new VendorPattern("^LEX.*", MOFI),
            new VendorPattern("^Hyundai.*", HYUNDAI),
            new VendorPattern("^L575.*", HYUNDAI),
            new VendorPattern("^PULP.*", WIKO),
            new VendorPattern("^WAX.*", WIKO),
            new VendorPattern("^LENNY.*", WIKO),
            new VendorPattern("^MEIZU.*", WIKO),
            new VendorPattern("^.*Panasonic.*", PANASONIC),
            new VendorPattern("^CPH1721.*", OPPO),
            new VendorPattern("^x5.*", DOOGEE),
            new VendorPattern("^DOOGEE.*", DOOGEE),
            new VendorPattern("^VOYAGER.*", DOOGEE),
            new VendorPattern("^Le\\s.*", LEECO),
            new VendorPattern("^LEX.*", LEECO),
            new VendorPattern("^K6000 Pro.*", OUKITEL),
            new VendorPattern("^S4035_4G.*", OWN),
            new VendorPattern("^.*NOBLEX.*", NOBLEX),
            new VendorPattern("^Kingo.*", KINGO),
            new VendorPattern("^EKO.*", EKO),
            new VendorPattern("^SMD_.*", DAEWOO),
            new VendorPattern("^Micromax.*", MICROMAX),
            new VendorPattern("^E7s.*", BLACKVIEW),
            new VendorPattern("^TECNO.*", TECNO),
            new VendorPattern("^u_pro.*", ELEPHONE),
            new VendorPattern("^Elephone.*", ELEPHONE),
            new VendorPattern("^UFO_.*", UFO),
            new VendorPattern("^Vodafone.*", VODAFONE),
            new VendorPattern("^NEOS.*", NEOS),
            new VendorPattern("^Philips.*", PHILIPSS),
            new VendorPattern("^W3.*", TECNO),
            new VendorPattern("^Energy.*", ENERGY_SISTEM),
            new VendorPattern("^.*Gravity.*", MAXWEST),
            new VendorPattern("^OPPO.*", OPPO),
            new VendorPattern("^WIAM.*", WIAM),
            new VendorPattern("^Wise.*", WISE),
            new VendorPattern("^Hisens.*", HISENSE)
    );

    Optional<String> findVendor(String device) {
        String cleanDevice = device.trim();

        return vendorPatterns.stream()
                .filter(vendor -> vendor.getPattern().matcher(cleanDevice).find())
                .findFirst()
                .map(VendorPattern::getVendor);
    }

}