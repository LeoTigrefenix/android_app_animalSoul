//===================================================================================================================================================================================
/*
    Description: An app where you can discover your animal soul. What type of animal represents your deep personality.
    APP reason: I made this app to learn how to build an app using kotlin and Java in AndroidStudio

    Functions: Login (NoSQL) and multiple layers,

    Version: V.0.1
    Version description: Look for the README.md file

*/
//===================================================================================================================================================================================



package com.leonidas.android_app_animalSoul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

/*
The == operator tests whether two variables have the same references (aka pointer to a memory address).
 Whereas the equals() method tests whether two variables refer to objects that have the same state (values).
*/

public class MainActivity extends AppCompatActivity {
    private TextView titulo;
    private ImageView imgAlljaguars;
    private ImageView img_jaguar_first;
    private ImageView img_jaguar_second;
    private ImageView img_jaguar_third;
    private ImageView img_jaguar_fourth;
    private ImageView img_arrowBack;
    private TextView textoResposta;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //Bumble é um tipo criado por meio da classe feita , como String
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //método da classe AppCompatActivity

        // Initialize views
        //   Button b_jaguar_first = findViewById(R.id.BJaguar1);
        titulo = findViewById(R.id.textoTopo);
        imgAlljaguars = findViewById(R.id.ImgAllJaguar);
        img_jaguar_first = findViewById(R.id.jaguar_first);
        img_jaguar_second = findViewById(R.id.jaguar_second);
        img_jaguar_third = findViewById(R.id.jaguar_third);
        img_jaguar_fourth = findViewById(R.id.jaguar_fourth);
        img_arrowBack = findViewById(R.id.arrowback);
        textoResposta = findViewById(R.id.resultado);
        ///---------------------
        //construtor nativo do Android
        Intent meuConstrutor = new Intent() ;//open files of many types

        //===================================================================================================
        //===================================================================================================
        //TESTING CONSTRUCTOR OPERATION. THERE IS NO CONNECTION WITH THE APP

        class construtor {

            //the variables of this class
            String nome;
            String email;
            String senha;
            int phoneNumber;

            //construtor ; usa o mesmo nome da classe. É uma função específica da classe
            //constructor ; uses the same class name. It is a class specific function
            construtor(String inNome,String inEmail, String inSenha){

                System.out.println(" ************************************* ");
                System.out.println("barato é loko, to dendro do construtor");
                System.out.println(" ************************************* ");

                this.nome = inNome;
                this.email = inEmail;
                this.senha = inSenha;
            };

            //overload of the constructor . I can access this constructor using a different type of data input
            construtor(int phoneNumber){

                this.phoneNumber = phoneNumber;
                System.out.println(" ************************************* ");
                System.out.println("input of a number int");
                System.out.println(phoneNumber);
                System.out.println(" ************************************* ");

            }

            construtor(){
                //empty
            }

            //função interna que monta o objeto dessa classe (MÉTODO)
            //intern function, makes a class' object
            Boolean verificarAlgo(String outName, String outEmail, String outSenha){

                return (Objects.equals(outName, this.nome) && Objects.equals(outEmail, this.email) && Objects.equals(outSenha, this.senha));

            }
//posso usar a função (método) com entrada diferente
            // I can use another method using the same name but different type input
            Boolean verificarAlgo(String token){
                String tokenFixoPorEnquanto = "09877";

                System.out.println(" --tokentokentokentoken-- ");
                System.out.println("auth (authentication by token");
                System.out.println("--tokentokentokentoken-- ");

                return (Objects.equals(token, tokenFixoPorEnquanto));
            }

        };


        construtor testando = new construtor("nomezim", "email@gmail.com", "senhazinha");

        System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ ");
        System.out.println(testando.email);
        System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ ");


        //chamar a função (método) interno da classe construida

        Boolean resultadoDeVerificacao = testando.verificarAlgo("nomezim","email@gmail.com.br", "senhazinha");

        System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ");
        System.out.println(resultadoDeVerificacao);
        System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ");


        //===================================================================================================
        //===================================================================================================


    }


        //Descrição de cada imagem ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        String descricaoJagua1 = "Você possui uma aura forte. Sua presença ilumina o lugar onde você chega e aquece o coração das pessoas com esperança e motivação. Jamais deixe que criticas negativas apaguem seu brilho.";
        String descricaoJagua2 = "Você preza por bons ambientes. A vida pode ter te atacado e pessoas podem ter te machucado e vc seguiu firme, parabéns. Não deixe de cuidar do seu corpo e da sua mente. Um corpo forte é uma mente forte.";

        String descricaoJagua3 = "Sempre atento a tudo e a todos. Um olhar que não perde os detalhes. A vaidade te acompanha de perto e você chama atenção onde quer que esteja. Com seu estilo próprio você não se impoem e também não passa despercebido.";

        String descricaoJagua4 = "Mais reflexivo e na sua, você não gosta de chamar atenção. Seu jeito impoem respeito mesmo sem precisar falar nada. Não tema as outras pessoas, o mundo pode ser cruel, mas se abrir e ter bons relacionamentos vai impulssionar sua vida.";
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        //funções para mostrar na tela o texto ao toque do botão ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        public void primeiroJaguar (View view) {

            if (imgAlljaguars.getVisibility() == View.VISIBLE && img_jaguar_first.getVisibility() == View.INVISIBLE) {
                imgAlljaguars.setVisibility(View.INVISIBLE);
                img_jaguar_first.setVisibility(View.VISIBLE);
                titulo.setVisibility(View.INVISIBLE);
                img_arrowBack.setVisibility(View.VISIBLE);
                textoResposta.setText(descricaoJagua1);
            }

            


        }

        public void segundoJaguar (View view){

            if (imgAlljaguars.getVisibility() == View.VISIBLE && img_jaguar_second.getVisibility() == View.INVISIBLE) {
                imgAlljaguars.setVisibility(View.INVISIBLE);
                titulo.setVisibility(View.INVISIBLE);
                img_jaguar_second.setVisibility(View.VISIBLE);
                img_arrowBack.setVisibility(View.VISIBLE);
                textoResposta.setText(descricaoJagua2);
            }

        }
        public void terceiroJaguar (View view){

            if (imgAlljaguars.getVisibility() == View.VISIBLE && img_jaguar_third.getVisibility() == View.INVISIBLE) {
                imgAlljaguars.setVisibility(View.INVISIBLE);
                titulo.setVisibility(View.INVISIBLE);
                img_jaguar_third.setVisibility(View.VISIBLE);
                img_arrowBack.setVisibility(View.VISIBLE);
                textoResposta.setText(descricaoJagua3);
            }

        }
        public void quartoJaguar (View view){

            if (imgAlljaguars.getVisibility() == View.VISIBLE && img_jaguar_fourth.getVisibility() == View.INVISIBLE) {
                imgAlljaguars.setVisibility(View.INVISIBLE);
                titulo.setVisibility(View.INVISIBLE);
                img_jaguar_fourth.setVisibility(View.VISIBLE);
                img_arrowBack.setVisibility(View.VISIBLE);
                textoResposta.setText(descricaoJagua4);
            }

        }
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        //função para voltar a tela------------------------------------------------------------------------------------------
        public void voltarTela (View view){

            if (img_arrowBack.getVisibility() == View.VISIBLE) {

                imgAlljaguars.setVisibility(View.VISIBLE);
                titulo.setVisibility(View.VISIBLE);

                img_jaguar_first.setVisibility(View.INVISIBLE);
                img_jaguar_second.setVisibility(View.INVISIBLE);
                img_jaguar_third.setVisibility(View.INVISIBLE);
                img_jaguar_fourth.setVisibility(View.INVISIBLE);

                img_arrowBack.setVisibility(View.INVISIBLE);

                textoResposta.setText("...");
            }


        }

        //-------------------------------------------------------------------------------------------------------------------




}