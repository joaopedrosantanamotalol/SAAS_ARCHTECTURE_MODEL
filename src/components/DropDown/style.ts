import { fonte_pequena } from "@/styles/fonts/fonte_pequena";
import { fonte_titulo } from "@/styles/fonts/fonte_titulo";
import { fonte_titulo_card } from "@/styles/fonts/fonte_titulo_card";
import { StyleSheet, Dimensions } from "react-native";

const { width, height } = Dimensions.get("window");

const body_width = width * 0.85;
const body_height = height * 0.10;


export const style = StyleSheet.create({
    canvas_body:{
        backgroundColor: "#d9d9d930",
        borderColor:"#FFFFFFB3",
        borderTopLeftRadius:20,
        borderTopRightRadius:10,
        borderBottomLeftRadius:10,
        borderBottomRightRadius:20,
        borderWidth:1,
        width: body_width,
        height:body_height,
        flexDirection: "row",
        alignItems: "center",
        gap: 10,
        paddingHorizontal: 0,
        margin:30,
        color: "white",
    },
    dropdown:{
    flex: 1,
    height: "100%",
    paddingHorizontal: 20,
    },
    placeholder: {
    ...fonte_titulo_card.titulo_principal,
    },
    cor_opcao:{
        ...fonte_pequena.titulo_principal
    }
})