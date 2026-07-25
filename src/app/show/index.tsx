import { Text, View } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";

import { style } from "@/styles/show/style";

export default function showPage(){
    return(

        <SafeAreaView style={style.background}>

            <View style={style.view_titulo}>
            <Text style={style.fonte_titulo}>Let us</Text>
            <Text style={style.titulo_destaque}>help</Text>
            <Text style={style.fonte_titulo}>you to set</Text>
            <Text style={style.fonte_titulo}>up your enviroment</Text>
            </View>

        </SafeAreaView>
    );
}