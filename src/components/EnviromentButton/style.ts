import { fonte_titulo } from "@/styles/fonts/fonte_titulo";
import { StyleSheet, Dimensions } from "react-native";

const { width, height } = Dimensions.get("window");

const body_width = width * 0.45;
const body_height = height * 0.10;

export const style = StyleSheet.create({
    canvas_body:{
        backgroundColor: "white",
        borderRadius:15,
        borderWidth:3,
        width: body_width,
        height:body_height,
        flexDirection: "row",
        alignItems: "center",
        gap: 10,
        paddingHorizontal: 16,
    },
    image_button:{
        height:32,
        width:32,
    },
    titulo:{
        ...fonte_titulo.titulo_principal,
                color: "yellow"
    }
})