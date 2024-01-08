//===================================================================================================================================================================================
/*
    Description: An app where you can discover your animal soul. What type of animal represents your deep personality.
    APP reason: I made this app to learn how to build an app using kotlin and Java in AndroidStudio

    Functions: Login (NoSQL) and multiple layers,

    Version: V.0.1
    Version description: Look for the README.md file

*/
//===================================================================================================================================================================================



package com.leonidas.aula_frase_do_dia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Bumble é um tipo criado por meio da classe feita , como String
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //método da classe AppCompatActivity
    }

        //Descrição de cada imagem ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            String descricaoJagua1 = "Você possui uma aura forte. Sua presença ilumina o lugar onde você chega e aquece o coração das pessoas com esperança e motivação. Jamais deixe que criticas negativas apaguem seu brilho.";
            String descricaoJagua2 = "Você preza por bons ambientes. A vida pode ter te atacado e pessoas podem ter te machucado e vc seguiu firme, parabéns. Não deixe de cuidar do seu corpo e da sua mente. Um corpo forte é uma mente forte.";

            String descricaoJagua3 = "Sempre atento a tudo e a todos. Um olhar que não perde os detalhes. A vaidade te acompanha de perto e você chama atenção onde quer que esteja. Com seu estilo próprio você não se impoem e também não passa despercebido.";

            String descricaoJagua4 = "Mais reflexivo e na sua, você não gosta de chamar atenção. Seu jeito impoem respeito mesmo sem precisar falar nada. Não tema as outras pessoas, o mundo pode ser cruel, mas se abrir e ter bons relacionamentos vai impulssionar sua vida.";
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        //funções para mostrar na tela o texto ao toque do botão ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            public void primeiroJaguar (View view){
                TextView textoResposta = findViewById(R.id.textView2);

                textoResposta.setText(descricaoJagua1);
            }

            public void segundoJaguar (View view){

                TextView textoResposta = findViewById(R.id.textView2);

                textoResposta.setText(descricaoJagua2);

            }
            public void terceiroJaguar (View view){

                TextView textoResposta = findViewById(R.id.textView2);

                textoResposta.setText(descricaoJagua3);

            }
            public void quartoJaguar (View view){

                TextView textoResposta = findViewById(R.id.textView2);

                textoResposta.setText(descricaoJagua4);

            }
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

}