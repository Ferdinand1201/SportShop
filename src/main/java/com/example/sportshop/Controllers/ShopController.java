package com.example.sportshop.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import com.example.sportshop.Model.ProductItem;
import com.example.sportshop.Model.SportClothItem;
import com.example.sportshop.Model.SportFoodItem;
import com.example.sportshop.Model.SportInventoryItem;
import com.example.sportshop.utils.FormUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class ShopController implements Initializable {
    private List<SportInventoryItem> sportInventoryList = new ArrayList<>(Arrays.asList(

            new SportInventoryItem("/com/example/images/itemImg/dumbells.PNG", "Gantere de 8 kg", "Set de gantere DFC DB001-4 (2 buc)", "150", "Gantere", "8kg", "Oțel"),
            new SportInventoryItem("/com/example/images/itemImg/Inventory/1.jpg", "Disc BB-203 realizat din plastic ABS, umplut cu ciment. Design individual, matriță cu logo-ul brandului Starfit. Calibrat pe greutate.", "Disc plastic BB-203", "30", "Disc atletic", "0.5kg", "Plastic"),
            new SportInventoryItem("/com/example/images/itemImg/Inventory/2.jpeg", "Greutate: 50,0 kg Culoare: negru Tip: olimpic Diametru: 51 mm Diametru exterior disc: 450 mm Grosimea discului: 70 mm Miez: metalic", "Disc olimpic Barbell d 51 mm negru", "50", "Disc olimpic", "50kg", "Oțel"),
            new SportInventoryItem("/com/example/images/itemImg/Inventory/3.jpeg", "Material: fontă Greutate: 8 kg Culoare: negru Diametru mâner: 30 mm Toleranță admisă: +/- g Ambalaj: nu Dimensiuni ambalaj (Lxlxh): 0,13 x 0,19 x 0,20 m", "Kettlebell «Leu»", "380", "Kettlebell", "8kg", "Fontă"),
            new SportInventoryItem("/com/example/images/itemImg/Inventory/4.jpg", "Greutate reglabilă care permite creșterea sarcinii și antrenarea diferitelor grupuri musculare. Notă: Producătorul își rezervă dreptul de a modifica designul și schema principală a produsului, fără a afecta calitatea acestuia, caracteristicile și proprietățile de consum fără notificare prealabilă.", "Gantera demontabilă Sportcom", "370", "Gantera demontabilă", "20kg", "Oțel cromat"),
            new SportInventoryItem("/com/example/images/itemImg/Inventory/5.png", "Construcție: demontabilă Material: discuri din compozit, acoperite cu plastic ABS; bară din oțel Greutate totală: 30 Greutate discuri: 2.5kg, 10 Diametru:...", "Bară demontabilă BB-401", "266", "Bară", "30kg", "Plastic ABS"),
            new SportInventoryItem("/com/example/images/itemImg/Inventory/6.png", "Domeniu de utilizare: case private și curți, amenajarea terenurilor din jurul casei, drumuri pietonale și trotuare, foișoare, terase, balcoane, paturi, zone din jurul piscinelor, centre de agrement și recreere. Plăcile de cauciuc se lipesc pe suprafața pregătită cu ajutorul unui liant pe bază de poliuretan. Se recomandă o bază solidă: beton, asfalt, lemn, piatră. Avantajele plăcii de cauciuc. Plăcile sunt durabile și rezistente la uzură. Materialul este elastic și are un risc scăzut de accidentare. Chiar și după ploaie, suprafața plăcii rămâne antiderapantă, iar iarna nu se deteriorează din cauza înghețului. Acoperirea poate fi curățată cu mijloace și unelte obișnuite. Posibilitatea de a înlocui plăcile deteriorate.", "Plăci de cauciuc pătrate", "320", "Placă", "2kg", "Cauciuc")
            ));

    private List<SportClothItem> sportClothList = new ArrayList<>(Arrays.asList(
            new SportClothItem("/com/example/images/itemImg/Boots/adidasSneakers.PNG", "Pantofi sport pentru alergare mărimea 44", "Pantofi sport adidas", "300", "Alb", "42-45", "Pantofi sport", "Poliester"),
            new SportClothItem("/com/example/images/itemImg/Boots/2.jpg", "Plecați în drum și știți că acești pantofi Adidas vor face față oricăror provocări. Modernizați aspectul clasic, având un pic mai multă înălțime și o formă elegantă. Partea superioară din piele premium asigură confortul și comoditatea în timpul purtării. Talpa din cauciuc durabilă asigură aderență în parc sau pe stradă. Tot ce trebuie să faceți este să îi combinați cu pantaloni scurți sau strâmtați.", "Pantofi bărbați Adidas ZNSORED", "610", "Alb, Negru", "42-45", "Pantofi sport", "Poliester, cauciuc"),
            new SportClothItem("/com/example/images/itemImg/Boots/3.jpg", "INOVAȚIE PENTRU GÂNDIREA DE URMĂ. Ridicați alergarea la un nou nivel cu noile pantofi sport ce transformă gravitația în mișcare înainte. Structura special concepută a tălpii intermediare din etilen-vinil-acetat are goluri speciale care se comprimă și se extind sub presiune, ajutându-vă să vă mișcați înainte cu fiecare pas. Confortul suplimentar este oferit de partea superioară din plasă respirabilă, iar suportul special din zona călcâiului asigură stabilitate la orice ritm. Talpa ușoară și performanțială asigură aderență optimă în orice condiții. Experimentați o mișcare lină cu noile pantofi sport.", "Pantofi bărbați Adidas SWITCH FWD RUNNING", "700", "Negru", "42-45", "Pantofi de alergare", "Poliester, TPU"),
            new SportClothItem("/com/example/images/itemImg/Boots/4.jpg", "Stil curat, proaspăt, subtil, care îți taie respirația. Acesta este aspectul pe care îl vei vedea când vei scoate pantofii adidas din cutie. Cele trei dungi în ton pe partea superioară simplă din piele sintetică creează o atmosferă tradițională. Talpa intermediară moale oferă un suport ușor deasupra tălpii din cauciuc stil retro.", "Pantofi bărbați Adidas Hoops 3.0", "290", "Alb, Gri", "42-45", "Pantofi de zi cu zi", "Piele sintetică, EVA"),
            new SportClothItem("/com/example/images/itemImg/Boots/5.jpg", "Mențineți-vă încrezători în fiecare joc, set și meci. Partea superioară din plasă ușoară și călcâiul moale fac acești pantofi adidas Gamecourt 2.0 partenerul perfect în tenis. Talpa intermediară completă din EVA asigură confort și conectare cu jocul. Talpa Adiwear oferă aderență uimitoare pe terenurile cu suprafață dură, fără a sacrifica durabilitatea.", "Pantofi bărbați pentru tenis Adidas GAMECOURT 2.0", "400", "Alb, Negru", "42-45", "Pantofi sport", "Textil"),
            new SportClothItem("/com/example/images/itemImg/Boots/6.jpg", "Este mai ușor să atingeți obiectivele în alergare cu o pereche de pantofi de alergare de zi cu zi, care să vă ajute să parcurgeți milele cu confort. Întâlniți pantofii adidas Solarboost 5. Combinând suportul, amortizarea și revenirea energiei, aceștia includ tehnologia reactivă Light BOOST cu partea superioară ușoară din plasă mono. Sistemul de impuls liniar oferă un mic impuls suplimentar cu fiecare pas. Această parte superioară, fabricată din materiale reciclate, conține cel puțin 50% material reciclat. Acest produs este doar una dintre soluțiile noastre pentru a pune capăt deșeurilor din plastic.", "Pantofi bărbați Adidas Solarboost 5", "650", "Alb, galben, albastru", "42-45", "Pantofi de alergare", "Textil, plasă mono"),
            new SportClothItem("/com/example/images/itemImg/Boots/7.png", "Pantofii de volei Nike Hyperspeed Court oferă tot ce poate oferi o încălțăminte sportivă de calitate. Indiferent dacă faceți multe mișcări rapide scurte sau săriți mult, acești pantofi oferă suport picioarelor și mai multă energie. Datorită materialului special din partea superioară, aceștia se remarcă prin durabilitate, astfel că nu doar voi, ci și încălțămintea voastră va dura mai mult.", "Pantofi volei Nike ZOOM HYPERSPEED COURT CI2964-100", "350", "Alb", "42-45", "Pantofi de volei", "Poliester"),
            new SportClothItem("/com/example/images/itemImg/Boots/8.jpg", "Când jocul tău cu încălțămintea este în afacerea timpului, poți să te deplasezi liber prin epoci. Întoarce-te în anii 80 cu acești pantofi Adidas. Cu estetică retro și culori care se potrivesc stării de azi, aceștia vor fi complementul perfect al arsenalului tău. Talpa intermediară moale Cloudfoam asigură confort pe tot parcursul zilei. Partea superioară, fabricată din materiale reciclate, conține cel puțin 50% material reciclat. Acest produs este doar una dintre soluțiile noastre pentru a pune capăt deșeurilor din plastic.", "Pantofi bărbați Adidas MIDCITY", "500", "Alb, Negru", "42-45", "Pantofi de zi cu zi", "Piele sintetică, Nubuc"),
            new SportClothItem("/com/example/images/itemImg/Boots/9.jpg", "Inhalează. Expiră. Tot ce trebuie să faci este să continui să mergi mai departe. În pantofii de alergare adidas te vei simți confortabil chiar și în vreme caldă. Partea superioară din plasă și talpa respirabilă oferă ventilație eficientă. Talpa intermediară flexibilă și ușoară Bounce amortizează ușor și oferă un confort suplimentar.", "Pantofi bărbați Adidas CLIMACOOL VENTANIA", "410", "Alb, Roșu", "42-45", "Pantofi de alergare", "Primegreen, Cauciuc"),
            new SportClothItem("/com/example/images/itemImg/Boots/10.jpg", "Acești pantofi cu un design masiv, ce creează atmosfera paternă, îți vor oferi confort pe toată durata zilei. Partea superioară din piele netedă este decorată cu tăieturi, aplicări și cele trei dungi caracteristice. Aceștia sunt fixați pe o talpă intermediară sculpturală și o talpă aderentă.", "Pantofi bărbați Adidas Strutter", "275", "Negru, Alb", "42-45", "Pantofi de zi cu zi", "Poliester")

    ));


    private List<SportFoodItem> sportPitList = new ArrayList<>(Arrays.asList(
            new SportFoodItem("/com/example/images/itemImg/wheyProtein.PNG", "Proteină din zer 90 g", "Proteină din zer", "150", "Proteine", "90g", "Proteină din zer", "90, 0, 10"),
            new SportFoodItem("/com/example/images/itemImg/SportPit/1.jpg", "L-carnitina ajută la transportul acizilor grași în mitocondriile celulare pentru a fi folosiți ca sursă de energie, iar cromul este un mineral care ajută la reglarea nivelului de glucoză din sânge și îmbunătățește metabolismul carbohidraților.", "L-carnitină + Crom", "80", "Carnitină", "90", "Colina-100mg, tirozină-250mg, cafeină-220mg", "10, 5, 0"),
            new SportFoodItem("/com/example/images/itemImg/SportPit/2.jpg", "Batoanele proteice cu proteine vegetale pentru persoanele active care preferă produsele vegane.", "Baton Bombbar Vegan", "7", "Baton proteic", "60g", "Izolat de proteină din mazăre, zahăr, ulei de palmier, proteina din zer, îndulcitori, E110", "21, 7.2, 2.4"),
            new SportFoodItem("/com/example/images/itemImg/SportPit/3.jpg", "Bomboanele SnaqFabriq Milky CANDY sunt o combinație incredibilă de ciocolată de lapte topită, umplutură fină și nuci crocante sau wafle.", "SNAQ FABRIQ MILKY Candy", "15", "Bomboane", "130g", "Ciocolată de lapte (fibre solubile de porumb, unt de cacao, cacao prăjită, lapte praf degresat, emulgator (lecitină de soia), arome naturale, îndulcitor (sukraloză)), umplutură de cremă (unt de cocos, aluloză, fibre solubile de porumb, lapte praf degresat, emulgator (lecitină de soia), arome naturale, îndulcitor (sukraloză)).", "9, 36, 11"),
            new SportFoodItem("/com/example/images/itemImg/SportPit/4.jpg", "Gustare excelentă sub formă de baton proteic fără zahăr. Batonul conține fibre alimentare care îmbunătățesc absorbția proteinelor. Are un gust original uimitor. O alegere excelentă pentru toți cei care țin la silueta lor.", "IDEAL BAR", "8", "Baton", "60g", "Concentrat de proteină din zer, concentrat de proteină din lapte, fibre solubile de porumb (prebiotic), apă purificată, izomalto-oligozaharid, echivalent de cacao măcinată, agenți de retenție a umidității: sirop de sorbitol, glicerină, arahide prăjite, pastă de arahide, emulgator lecitină de soia, acid citric, aromă identică naturală, fibre de grâu insolubile, sukraloză, acid sorbic", "20, 4.5, 4.5"),
            new SportFoodItem("/com/example/images/itemImg/SportPit/5.jpg", "Magneziul este un mineral esențial pentru producerea de energie și metabolism, contracția mușchilor, transmiterea impulsurilor și mineralizarea oaselor. Este necesar pentru formarea a aproximativ 300 de enzime. Aceste enzime stimulează procese precum sinteza acizilor grași, sinteza proteinelor și absorbția glucozei. Menținerea unui nivel normal de magneziu în organism este foarte importantă pentru schimbul de calciu, deoarece acesta participă la funcționarea glandei paratiroide.", "Citrat de magneziu 400 mg", "120", "Magneziu", "120g", "Celuloză microcristalină, celuloză vegetală, dioxid de siliciu, fosfat de dicalciu, stearat de magneziu vegetal, dioxid de titan, glicerina vegetală.", "10, 4, 4")




    ));

    private List <ProductItem> mainProductsList = new ArrayList<>();

    @FXML
    private Button btn_auth;

    @FXML
    private Button btn_cloth;

    @FXML
    private Button btn_inventory;

    @FXML
    private Button btn_problem;

    @FXML
    private Button btn_sportPit;

    @FXML
    private VBox itemList;

    @FXML
    private Label lbl_title;




    @FXML
    void btn_authOnClicked(MouseEvent event)throws IOException  {
        FormUtil.loadAndHide(btn_auth,"/com/example/sportshop/author.fxml","Informații despre autor");


    }

    @FXML
    void btn_clothOnClicked(MouseEvent event) {
        lbl_title.setText("Încălțăminte");
        mainProductsList.clear();
        mainProductsList.addAll(sportClothList);
        loadListItems();
    }

    @FXML
    void btn_inventoryOnClicked(MouseEvent event) {
        lbl_title.setText("Echipament fitness");
        mainProductsList.clear();
        mainProductsList.addAll(sportInventoryList);
        loadListItems();
    }

    @FXML
    void btn_problemOnClicked(MouseEvent event) throws IOException {
        FormUtil.loadAndHide(btn_problem,"/com/example/sportshop/error-form.fxml","Raportează o problemă");
    }

    @FXML
    void btn_sportPitOnClicked(MouseEvent event) {
        lbl_title.setText("Nutriție sportivă");
        mainProductsList.clear();
        mainProductsList.addAll(sportPitList);
        loadListItems();
    }

    private void loadListItems (){
        itemList.getChildren().clear();
        List<ProductItem> productItems = new ArrayList<>(mainProductsList);
        for (int i = 0; i < productItems.size(); i++){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/com/example/sportshop/product-item.fxml"));


            try {
                VBox vBox = fxmlLoader.load();
                ItemController ic = fxmlLoader.getController();
                ic.setData(productItems.get(i));
                itemList.getChildren().add(vBox);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {

       mainProductsList.addAll(sportPitList);
       loadListItems();


    }
}
