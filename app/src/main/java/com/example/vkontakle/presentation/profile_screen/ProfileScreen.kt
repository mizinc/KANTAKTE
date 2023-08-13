package com.example.vkontakle.presentation.profile_screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.vkontakle.R
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vkontakle.presentation.navigation.NavController
import com.example.vkontakle.ui.theme.QuickSand
import com.example.vkontakle.ui.theme.SuperGrayColor
import com.example.vkontakle.ui.theme.VkColor


@Composable
fun ProfileScreen(navHostController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(text="id59901046466", fontFamily = QuickSand, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Укажите короткое имя", color = VkColor, fontFamily = QuickSand)
                    }
                },
                backgroundColor = Color.White,
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painterResource(id = R.drawable.qr_code),
                            contentDescription = "bez_raznici",
                            tint = VkColor,
                            modifier = Modifier.size(30.dp),
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painterResource(id = R.drawable.menu),
                            contentDescription = "bez_raznici2",
                            tint = VkColor,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }
            )
        },
        
        bottomBar = {
            BottomNavigation(
                backgroundColor = Color.White
            ) {
                BottomNavigationItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = { Icon(painter = painterResource(id = R.drawable.news), contentDescription = "profile_icon") }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = { Icon(painter = painterResource(id = R.drawable.pizza), contentDescription = "profile_icon", tint = Color.Gray) }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = {
                              navHostController.navigate(NavController.MessendgerScreen.route)
                    },
                    icon = { Icon(painter = painterResource(id = R.drawable.chat), contentDescription = "profile_icon", tint = Color.Gray) }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = { Icon(painter = painterResource(id = R.drawable.group), contentDescription = "profile_icon", tint = Color.Gray) }
                )
                BottomNavigationItem(
                    selected = true,
                    onClick = { /*TODO*/ },
                    enabled = true,
                    icon = { Icon(painter = painterResource(id = R.drawable.profile), contentDescription = "profile_icon", tint = Color.Gray) }
                )
            }
        },
    ) {
        Box(modifier = Modifier
            .padding(it)
            .padding(top = 10.dp)) {
            Column {
                Row() {
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(
                        painter = painterResource(id = R.drawable.add_photo_image),
                        contentDescription = "add_photo_image",
                        modifier = Modifier
                            .clip(CircleShape)
                            .clickable { }
                            .size(80.dp)
                    )
                    Spacer(modifier = Modifier.width(7.dp))
                    Column {
                        Text(
                            text = "Артем Соломатов",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            fontFamily = QuickSand
                        )
                        Text(text = "Расскажите о себе", color = VkColor, fontFamily = QuickSand, fontSize = 20.sp)
                        Row {
                            Text(text = "online", fontFamily = QuickSand, color=Color.Gray, fontSize = 18.sp)
                            Icon(
                                painter = painterResource(id = R.drawable.phone),
                                contentDescription = "phone",
                                modifier = Modifier.size(18.dp),
                                tint = Color.Gray
                            )
                        }

                    }
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(SuperGrayColor),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp)
                ) {
                    Text(text = "Редактировать", fontFamily = QuickSand, color = VkColor, fontWeight = FontWeight.Bold)
                }
                Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(painter = painterResource(id = R.drawable.baseline_photo_camera_24), contentDescription = "camera", tint= VkColor)
                            Text(text = "История", color = VkColor)
                        }
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(painter = painterResource(id = R.drawable.pencil), contentDescription = "pencil", tint= VkColor)
                            Text(text = "Запись", color = VkColor)
                        }
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(painter = painterResource(id = R.drawable.peizash), contentDescription = "пейзаж", tint= VkColor)
                            Text(text = "фото", color = VkColor)
                        }
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(painter = painterResource(id = R.drawable.twitch), contentDescription = "эфир", tint= VkColor)
                            Text(text = "Трансляция", color = VkColor)
                        }
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Card {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        TextButton(onClick = { /*TODO*/ }) {
                            Row() {
                                Icon(painter = painterResource(id = R.drawable.school), contentDescription = "school", tint = VkColor)
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(text = "Укажите место учёбы", color = VkColor, fontFamily = QuickSand, fontWeight = FontWeight.Bold)
                            }
                        }
                        TextButton(onClick = { /*TODO*/ }) {
                            Row() {
                                Icon(painter = painterResource(id = R.drawable.job), contentDescription = "school", tint = VkColor)
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(text = "Укажите место работы", color = VkColor, fontFamily = QuickSand, fontWeight = FontWeight.Bold)
                            }
                        }
                        TextButton(onClick = { /*TODO*/ }) {
                            Row() {
                                Icon(painter = painterResource(id = R.drawable.baseline_info_24), contentDescription = "school", tint = VkColor)
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(text = "Подробная информация", color = VkColor, fontFamily = QuickSand, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                GetPhotoCard()
            }
        } 
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun GetPhotoCard() {
    Card (
        onClick = {}
       )
    {
        Column {
            Text(text = "Фотографии", fontSize = 21.sp, modifier = Modifier.padding(start = 10.dp))
            Box(contentAlignment = Alignment.Center) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {

                    Square()

                    Spacer(modifier = Modifier.width(10.dp))

                    Square()

                    Spacer(modifier = Modifier.width(10.dp))

                    Square()
                }
                Row {
                    Icon(painter = painterResource(id = R.drawable.baseline_photo_camera_24), contentDescription = null, tint = VkColor)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Добавить фото", fontSize = 20.sp, color = VkColor, fontFamily = QuickSand)
                }
            }
        }
    }
}

@Composable
private fun Square() {
    Image(
        painterResource(id = R.drawable.gray_image),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            // Workaround to enable alpha compositing
            .graphicsLayer { alpha = 0.99f }
            .drawWithContent {
                val colors = listOf(
                    Color.Black,
                    Color.Transparent
                )
                drawContent()
                drawRect(
                    brush = Brush.verticalGradient(colors),
                    blendMode = BlendMode.DstIn
                )
            }
            .size(125.dp)
    )
}
