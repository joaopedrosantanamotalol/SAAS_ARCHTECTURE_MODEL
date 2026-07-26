import { fonte_titulo } from "@/styles/fonts/fonte_titulo";
import { StyleSheet, Dimensions } from "react-native";

const { width, height } = Dimensions.get("window");

const body_width = width * 0.85;
const body_height = height * 0.10;
const text_margin = width * 0.03;

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
        paddingHorizontal: 16,
        margin:30,
    },
    image_button:{
        height:32,
        width:32,
    },
    titulo:{
        ...fonte_titulo.titulo_principal,
                color: "white",
                alignSelf:"center",
                margin: text_margin,
    }
})