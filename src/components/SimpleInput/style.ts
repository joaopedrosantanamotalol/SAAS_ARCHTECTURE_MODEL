import { fonte_titulo_card } from "@/styles/fonts/fonte_titulo_card";
import { StyleSheet, Dimensions } from "react-native";

const { width, height } = Dimensions.get("window");

const body_width = width * 0.85;
const body_height = height * 0.10;
const fontsize = width * 0.055;

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
    },
    titulo:{
        ...fonte_titulo_card.titulo_principal,
                color: "white",
                alignSelf:"center",
    },
    input:{
        paddingLeft:20,
        color:"white",
        fontSize:fontsize,
        fontWeight:"bold"
    }
})