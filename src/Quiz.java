public class Quiz {
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

    }
}
