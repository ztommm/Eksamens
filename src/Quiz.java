import java.util.Scanner;

public class Quiz {
    // Masīvs ar visiem jautājumiem
    String[] jautajumi = {
            "Kas ir skaitliskais mainīgais?",
            "Kā saglabā skaitlisko mainīgo?",
            "Kādas ir biežāk lietotās aritmētiskās operācijas Java?",
            "Kā veikt inkrementāciju vai dekrementāciju Java?",
            "Kā ģenerēt gadījuma skaitļus Java?",
            "Kā pārveidot skaitlisko mainīgo vērtību uz tekstu Java?",
            "Kā iegūt lielāko vai mazāko vērtību no vairākiem mainīgajiem Java?",
            "Kā aprēķināt kvadrātsakni vai pacelt skaitli pakāpē Java?",
            "Kā noapaļot skaitli uz leju/uz augšu Java?",
            "Kā pārvērst tekstu uz skaitlisko mainīgo vērtību Java?"
    };
    // Masīvs ar atbilžu variantiem
    String[][] izveles = {
            {"Skaitliski dati", "Skaitliskas vērtības", "Mainīgais, kurš var būt vārds", "Mainīgais, kuram ir slepena nozīme"},
            {"int", "String", "double", "boolean"},
            {"Saskaitīšana(+)", "sqrt", "Atņemšana(-)", "Atlikuma dalījums (%)"},
            {"^x", "--x", "/", "++x"},
            {"Izmantojot Random klasi", "Math.Generate", "Izmantojot Generate klasi", "Math.random()"},
            {"Izmantojot Convert.int", "Izmantojot String.format()", "Izmantojot String.valueOf()", "Izmantojot int.toString"},
            {"Izmantojot Math.GetMaximum", "Izmantojot Math.min()", "Izmantojot Math.GetLowest", "Izmantojot Math.max()"},
            {"Izmantojot Math.sqrt()", "Izmantojot SquareRootOf", "Izmantojot Math.pow()", "Izmantojot Math.powerOf()"},
            {"Izmantojot Math.lower()", "Izmantojot Math.higher()", "Izmantojot Math.floor()", "Izmantojot Math.ceil()"},
            {"Izmantojot Integer.parseInt()", "Izmantojot int.TransformText()", "Izmantojot Double.parseDouble()", "Izmantojot Double.ToText()"}
    };
    // Masīvs ar visām pareizām atbildēm
    char[][] pareizasAtbildes = {
            {'A', 'B'},
            {'A', 'C'},
            {'A', 'C'},
            {'B', 'D'},
            {'A', 'D'},
            {'B', 'C'},
            {'B', 'D'},
            {'A', 'C'},
            {'C', 'D'},
            {'A', 'C'}
    };

    public void saktSpeli() {
        Scanner scanner = new Scanner(System.in);
        int punkti = 0;

        // Cikls, iziet caur visiem jautājumiem
        for (int i = 0; i < jautajumi.length; i++) {
            System.out.println((i + 1) + ". Jautājums:");
            System.out.println(jautajumi[i]); // Parāda jautājumu, pēc katras pareizas atbildes.
            paraditIzveles(i); // Parāda atbilžu izvēles
            int meginajumi = 0;

            while (true) {
                System.out.print("Jūsu atbilde: ");
                String lietotajaAtbilde = scanner.nextLine();

                // Ja atbildēts pareizi pirmajā reizē, tad pieskaita punktu. (meginajumi == 0)
                if (vaiAtbildePareiza(i, lietotajaAtbilde) && meginajumi == 0) {
                    punkti++;
                    System.out.println("Pareizi! Punktam pieskaitīts.");
                    break;
                // Ja atbildēts pareizi nepirmajā reizē, tad nepieskaita puntku. (meginajumi > 0)
                } else if (vaiAtbildePareiza(i, lietotajaAtbilde)) {
                    System.out.println("Pareizi!");
                    break;

                    // Ja atbildēts nepareizi, tad meginajumi++ un nākamajā mēģinājumā nepieskaita punktu.
                } else {
                    meginajumi++;
                    System.out.println("Nepareizi. Mēģiniet vēlreiz.");
                }
            }

            System.out.println();
        }

        System.out.println("Spēle izspēlēta! Jūsu punkti: " + punkti + "/" + jautajumi.length);
    }

    // Parāda konkrētā jautājuma pieejamās opcijas.
    public void paraditIzveles(int jautajumuSkaits) {
        String[] jautajumuIzveles = izveles[jautajumuSkaits]; // Saglabā konkrētā jautājuma opcijas.
        for (int i = 0; i < jautajumuIzveles.length; i++) { // Cikls, kurš pēc katras pareizās atbildes, parāda nākamās izvēles.
            System.out.println((char) ('A' + i) + ") " + jautajumuIzveles[i]);
        }
    }

    // Pārbauda vai lietotāja ievadītā atbilde sakrīt ar pareizo atbildi
    public boolean vaiAtbildePareiza(int jautajumuSkaits, String lietotajaAtbilde) {
        char[] pareizaAtbilde = pareizasAtbildes[jautajumuSkaits]; // Iegūst pareizās atbildes uz pašreizējo jautājumu, piekļūstot pareizasAtbildes masīvam.
        char lietotajaMinejums = Character.toUpperCase(lietotajaAtbilde.charAt(0)); // Pārmaina lietotāja ievadīto burtu uz lielu

        for (char atbilde : pareizaAtbilde) {
            if (atbilde == lietotajaMinejums) { // Pārbauda, ja lietotāja ievadītā atbilde sakrīt ar pareizo atbildi un pārmaina vaiAtbildePareiza uz True
                return true;
            }
        }
        return false;
    }
}