import { StyleSheet, Dimensions } from "react-native";

import { fonte_titulo } from "../fonts/fonte_titulo";
import { fonte_destaque } from "../fonts/fonte_titulo_amarelo";

const { width, height } = Dimensions.get("window");

const body_width = width * 0.85;
const body_height = height * 0.10;
const margem_titulo_x = width * 0.1;
const margem_titulo_y = width * 0.02;
const padding_top = height * 0.0;

export const style = StyleSheet.create({
    background:{
            flex:1,
            zIndex:1,
        },
        view_titulo:{
            flexDirection:"row",
            gap:5,
            flexWrap:"wrap",
            marginHorizontal:margem_titulo_x,
            marginVertical:margem_titulo_y,
            paddingTop:padding_top,
    
            zIndex:2,
        },
        fonte_titulo: {
           ...fonte_titulo.titulo_principal
        },
        titulo_destaque:{
           ...fonte_destaque.titulo_principal_destaque
        },
        button_container:{
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
    center:{
        flex:1,
        alignItems:"center"
    }
})