package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Canvas
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            //TelaInicial()
            //TelaLogin()
            //TelaOrcamento()
            //TelaRelatorio()

        }
    }
}

val VerdeEscuro = Color(0xFF004D3A)
val Verde = Color(0xFF079B36)
val VerdeClaro = Color(0xFF76D84E)
val VerdeOrcamento = Color(0xFF79AB6B)
val CinzaFundo = Color(0xFFF7F7F7)

val Vermelho = Color(0xFFF44336)
val Azul = Color(0xFF2196F3)
val Amarelo = Color(0xFFFFC107)
val Roxo = Color(0xFF8B5CF6)


@Composable
fun TelaInicial() {

    Scaffold {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(VerdeEscuro)
                .padding(it)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        start = 28.dp,
                        end = 28.dp,
                        top = 50.dp,
                        bottom = 35.dp
                    ),
                verticalArrangement = Arrangement.SpaceBetween
            ) {



                Column {

                    Text(
                        text = "contaê",
                        color = Color.White,
                        fontSize = 45.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )

                    Text(
                        text = "Seu dinheiro,\nsuas escolhas,\nseu controle.",
                        color = Color.White,
                        fontSize = 17.sp,
                        lineHeight = 25.sp
                    )
                }


                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "🐷",
                        fontSize = 110.sp
                    )

                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )

                    Text(
                        text = "💰        💰",
                        fontSize = 35.sp
                    )
                }



                Button(
                    onClick = {
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Verde
                    ),
                    shape = RoundedCornerShape(30.dp)
                ) {

                    Text(
                        text = "Vamos começar  →",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}



@Composable
fun TelaLogin() {


    var email = remember {
        mutableStateOf("")
    }

    var senha = remember {
        mutableStateOf("")
    }

    Scaffold(
        containerColor = Color.White
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 30.dp),
            verticalArrangement = Arrangement.Center
        ) {


            LogoLogin()

            Spacer(
                modifier = Modifier.height(40.dp)
            )


            CampoEmail(
                email = email.value,
                onEmailChange = {
                    email.value = it
                }
            )

            Spacer(
                modifier = Modifier.height(18.dp)
            )

            CampoSenha(
                senha = senha.value,
                onSenhaChange = {
                    senha.value = it
                }
            )

            Spacer(
                modifier = Modifier.height(30.dp)
            )



            Button(
                onClick = {
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = VerdeClaro
                ),
                shape = RoundedCornerShape(30.dp)
            ) {

                Text(
                    text = "Entrar",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(
                modifier = Modifier.height(22.dp)
            )


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "Não tem conta? ",
                    fontSize = 14.sp,
                    color = Color.DarkGray
                )

                Text(
                    text = "Cadastre-se",
                    fontSize = 14.sp,
                    color = VerdeClaro,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun LogoLogin() {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "contaê",
            color = VerdeEscuro,
            fontSize = 45.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(15.dp)
        )

        Text(
            text = "Faça login para continuar\ne cuidar das suas finanças.",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun CampoEmail(
    email: String,
    onEmailChange: (String) -> Unit
) {

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        Text(
            text = "E-mail",
            fontSize = 14.sp,
            color = Color.DarkGray
        )

        Spacer(
            modifier = Modifier.height(5.dp)
        )

        OutlinedTextField(
            value = email,
            onValueChange = onEmailChange,
            placeholder = {
                Text("seu@email.com")
            },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            shape = RoundedCornerShape(15.dp)
        )
    }
}

@Composable
fun CampoSenha(
    senha: String,
    onSenhaChange: (String) -> Unit
) {

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        Text(
            text = "Senha",
            fontSize = 14.sp,
            color = Color.DarkGray
        )

        Spacer(
            modifier = Modifier.height(5.dp)
        )

        OutlinedTextField(
            value = senha,
            onValueChange = onSenhaChange,
            placeholder = {
                Text("Digite sua senha")
            },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            shape = RoundedCornerShape(15.dp)
        )
    }
}

@Composable
fun TelaOrcamento() {

    Scaffold(
        containerColor = CinzaFundo
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {



            CabecalhoOrcamento()

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {

                Spacer(
                    modifier = Modifier.height(10.dp)
                )

                ResumoOrcamento()


                Spacer(
                    modifier = Modifier.height(20.dp)
                )


                Text(
                    text = "Orçamento por categoria",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.DarkGray
                )

                Spacer(
                    modifier = Modifier.height(10.dp)
                )

                CategoriaOrcamento(
                    nome = "🍴  Alimentação",
                    valor = "R$850,00",
                    porcentagem = "73%",
                    cor = Vermelho
                )

                CategoriaOrcamento(
                    nome = "🚌  Transporte",
                    valor = "R$500,00",
                    porcentagem = "64%",
                    cor = Azul
                )

                CategoriaOrcamento(
                    nome = "🏠  Moradia",
                    valor = "R$1.200,00",
                    porcentagem = "100%",
                    cor = Verde
                )

                CategoriaOrcamento(
                    nome = "🎮  Lazer",
                    valor = "R$250,00",
                    porcentagem = "72%",
                    cor = Amarelo
                )

                CategoriaOrcamento(
                    nome = "💜  Saúde",
                    valor = "R$200,00",
                    porcentagem = "75%",
                    cor = Roxo
                )


                Spacer(
                    modifier = Modifier.height(15.dp)
                )


                Button(
                    onClick = {
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Verde
                    ),
                    shape = RoundedCornerShape(25.dp)
                ) {

                    Text(
                        text = "Adicionar orçamento",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
@Composable
fun CabecalhoOrcamento() {

    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color.White
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "←",
                color = Verde,
                fontSize = 30.sp
            )

            Spacer(
                modifier = Modifier.width(15.dp)
            )

            Text(
                text = "Orçamento",
                modifier = Modifier.weight(1f),
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "⚙",
                fontSize = 25.sp
            )
        }
    }
}
@Composable
fun ResumoOrcamento() {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(25.dp),
        colors = CardDefaults.cardColors(
            containerColor = VerdeOrcamento
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = "Dinheiro separado",
                    color = Color.White,
                    fontSize = 13.sp
                )

                Text(
                    text = "R$3.000,00",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(
                    modifier = Modifier.height(12.dp)
                )

                Text(
                    text = "Já utilizado",
                    color = Color.White,
                    fontSize = 13.sp
                )

                Text(
                    text = "R$1.762,60 (58,8%)",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

                Spacer(
                    modifier = Modifier.height(12.dp)
                )

                Text(
                    text = "Saldo restante",
                    color = Color.White,
                    fontSize = 13.sp
                )

                Text(
                    text = "R$1.237,40",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = "🐷",
                fontSize = 50.sp
            )
        }
    }
}

@Composable
fun CategoriaOrcamento(
    nome: String,
    valor: String,
    porcentagem: String,
    cor: Color
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(12.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = nome,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(
                    modifier = Modifier.height(7.dp)
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.85f)
                        .height(4.dp)
                        .background(cor)
                )
            }

            Column(
                horizontalAlignment = Alignment.End
            ) {

                Text(
                    text = valor,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = porcentagem,
                    fontSize = 12.sp,
                    color = Color.DarkGray
                )
            }
        }
    }
}

@Composable
fun TelaRelatorio() {

    Scaffold(
        containerColor = Color.White
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 15.dp,
                        end = 20.dp,
                        top = 20.dp,
                        bottom = 10.dp
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "←",
                    color = Verde,
                    fontSize = 34.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(
                    modifier = Modifier.width(18.dp)
                )

                Text(
                    text = "Relatório",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 25.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "←",
                    fontSize = 30.sp,
                    color = Color.Black
                )

                Text(
                    text = "Maio de 2025",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "→",
                    fontSize = 30.sp,
                    color = Color.Black
                )
            }

            Spacer(
                modifier = Modifier.height(15.dp)
            )

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Total de gastos",
                    fontSize = 14.sp,
                    color = Color.Gray
                )

                Spacer(
                    modifier = Modifier.height(5.dp)
                )

                Text(
                    text = "R$ 2.562,30",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Verde
                )
            }

            Canvas(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {

                val diametro = minOf(
                    size.width * 0.62f,
                    size.height * 0.62f
                )

                val espessura = diametro * 0.30f

                val valores = listOf(
                    25f,
                    20f,
                    18f,
                    17f,
                    10f,
                    10f
                )

                val cores = listOf(
                    Vermelho,
                    Azul,
                    Color(0xFFFF9800),
                    Amarelo,
                    Verde,
                    Roxo
                )

                var anguloInicial = -90f

                valores.forEachIndexed { index, valor ->

                    val angulo = valor / 100f * 360f

                    drawArc(
                        color = cores[index],
                        startAngle = anguloInicial,
                        sweepAngle = angulo,
                        useCenter = false,
                        topLeft = Offset(
                            (size.width - diametro) / 2,
                            (size.height - diametro) / 2
                        ),
                        size = Size(
                            diametro,
                            diametro
                        ),
                        style = Stroke(
                            width = espessura,
                            cap = StrokeCap.Butt
                        )
                    )

                    anguloInicial += angulo
                }

                drawCircle(
                    color = Color.White,
                    radius = diametro * 0.20f,
                    center = Offset(
                        size.width / 2,
                        size.height / 2
                    )
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 25.dp,
                        end = 25.dp,
                        bottom = 35.dp
                    ),
                horizontalArrangement = Arrangement.Center
            ) {

                Column {

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(vertical = 4.dp)
                    ) {

                        Box(
                            modifier = Modifier
                                .size(10.dp)
                                .background(Vermelho)
                        )

                        Spacer(
                            modifier = Modifier.width(7.dp)
                        )

                        Text(
                            text = "Alimentação (25%)",
                            fontSize = 11.sp,
                            color = Color.DarkGray
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(vertical = 4.dp)
                    ) {

                        Box(
                            modifier = Modifier
                                .size(10.dp)
                                .background(Color(0xFFFF9800))
                        )

                        Spacer(
                            modifier = Modifier.width(7.dp)
                        )

                        Text(
                            text = "Lazer (18%)",
                            fontSize = 11.sp,
                            color = Color.DarkGray
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(vertical = 4.dp)
                    ) {

                        Box(
                            modifier = Modifier
                                .size(10.dp)
                                .background(Verde)
                        )

                        Spacer(
                            modifier = Modifier.width(7.dp)
                        )

                        Text(
                            text = "Educação (10%)",
                            fontSize = 11.sp,
                            color = Color.DarkGray
                        )
                    }
                }

                Spacer(
                    modifier = Modifier.width(35.dp)
                )

                Column {

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(vertical = 4.dp)
                    ) {

                        Box(
                            modifier = Modifier
                                .size(10.dp)
                                .background(Azul)
                        )

                        Spacer(
                            modifier = Modifier.width(7.dp)
                        )

                        Text(
                            text = "Transporte (20%)",
                            fontSize = 11.sp,
                            color = Color.DarkGray
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(vertical = 4.dp)
                    ) {

                        Box(
                            modifier = Modifier
                                .size(10.dp)
                                .background(Amarelo)
                        )

                        Spacer(
                            modifier = Modifier.width(7.dp)
                        )

                        Text(
                            text = "Moradia (17%)",
                            fontSize = 11.sp,
                            color = Color.DarkGray
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(vertical = 4.dp)
                    ) {

                        Box(
                            modifier = Modifier
                                .size(10.dp)
                                .background(Roxo)
                        )

                        Spacer(
                            modifier = Modifier.width(7.dp)
                        )

                        Text(
                            text = "Saúde (10%)",
                            fontSize = 11.sp,
                            color = Color.DarkGray
                        )
                    }
                }
            }
        }
    }
}