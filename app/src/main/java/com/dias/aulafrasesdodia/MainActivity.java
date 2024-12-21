package com.dias.aulafrasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Atributo
    String[] frases = {
            "Grandes jornadas começam com pequenos passos.",
            "Não espere por motivação, faça com disciplina.",
            "Seu futuro é criado pelo que você faz hoje, não amanhã.",
            "Transforme seus sonhos em metas e suas metas em conquistas.",
            "O impossível é só uma opinião, não um fato.",
    };

    /*
    textResultado, buttonResultado, editResultado
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarFrase(View view) {
        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(5);
        String frase = frases[numeroAleatorio];

        texto.setText(frase);
    }

    public void exibirTodas(View view) {
        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";

        //Aqui ele percorre cada item do meu arrey frases
        for (String frase : frases) {
            textoResultado = textoResultado + frase + "\n\n";
        }
        texto.setText(textoResultado);
    }
}