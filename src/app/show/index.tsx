import { Text, View } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";

import { style } from "@/styles/show/style";
import { EnviromentButton } from "@/components/EnviromentButton";
import { LinearGradient } from "expo-linear-gradient";
import { Bolha } from "@/components/bolha1";
import { Bolha2 } from "@/components/bolha2";

export default function showPage(){
    return(
        <LinearGradient
            colors={["#6F5A9D","#E4DCF4"]}
            start={{ x: 0, y: 0 }}
            end={{ x: 1, y: 1 }}
            style={{ flex: 1 }}
        >

            {/* Fundo */}
            <Bolha />
            <Bolha2 />

            {/* Conteúdo */}
            <SafeAreaView style={style.background}>

                <View style={style.view_titulo}>
                    <Text style={style.fonte_titulo}>
                        Let us
                    </Text>

                    <Text style={style.titulo_destaque}>
                        help
                    </Text>

                    <Text style={style.fonte_titulo}>
                        you to set
                    </Text>

                    <Text style={style.fonte_titulo}>
                        up your enviroment
                    </Text>
                </View>


                <View style={style.button_container}>
                    <EnviromentButton 
                        image={require("@/assets/images/button/images.png")} 
                        titleWhite="Product"
                    />

                    <EnviromentButton 
                        image={require("@/assets/images/button/lapis.png")} 
                        titleWhite="Service"
                    />
                </View>

            </SafeAreaView>

        </LinearGradient>
    );
}