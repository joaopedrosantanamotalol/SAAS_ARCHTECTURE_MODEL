import { Bolha } from "@/components/bolha1";
import { Bolha2 } from "@/components/bolha2";
import { LinearGradient } from "expo-linear-gradient";
import { SafeAreaView } from "react-native-safe-area-context";
import { style } from "@/styles/insert_business/style";
import { Text, View } from "react-native";
import { useState } from "react";
import { DropDown } from "@/components/DropDown";
import { SimpleCard } from "@/components/SimpleInput";
import { SimpleCardTelefone } from "@/components/SimpleInputTelefone";
import { KeyboardAwareScrollView } from "react-native-keyboard-aware-scroll-view";
import { SmallButton } from "@/components/SmallButton";

const categorias = [
  { label: "Digital", value: "digital" },
  { label: "Agro", value: "agro" },
  { label: "Farmácia", value: "farmacia" },
];

export default function InsertBusiness(){
    const [value, setValue] = useState<string | null>(null);
    return(
        <LinearGradient
            colors={["#6F5A9D","#E4DCF4"]}
            start={{ x: 0, y: 0 }}
            end={{ x: 1, y: 1 }}
            style={{ flex: 1 }}
        >
            {/* Fundo */}
            <Bolha></Bolha>

            {/* Fundo */}
            <Bolha2></Bolha2>

            {/* Conteudo */}

            <KeyboardAwareScrollView
            enableOnAndroid
            enableAutomaticScroll
            extraScrollHeight={150}
            keyboardShouldPersistTaps="handled"
            contentContainerStyle={{ flexGrow: 1 }}

            >

            <SafeAreaView style={style.background}>

            <View style={style.view_titulo}>
            <Text style={style.fonte_titulo}>Now Let's</Text>
            <Text style={style.fonte_titulo}>insert your</Text>
            <Text style={style.titulo_destaque}>business</Text>
            </View>

            <SimpleCard
            titleWhite="Business Name:"
            />

            <DropDown
            options={categorias}
            ></DropDown>

            <SimpleCardTelefone 
            titleWhite="Business Name:"
            />

            <View style={style.center}>
            <SmallButton
            titleWhite="Continue"
            />
            </View>

            
            
            </SafeAreaView>
        </KeyboardAwareScrollView>
        </LinearGradient>
    );
}