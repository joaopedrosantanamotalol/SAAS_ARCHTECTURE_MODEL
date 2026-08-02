import { StyleSheet, Dimensions } from "react-native";

import { fonte_titulo } from "../fonts/fonte_titulo";
import { fonte_destaque } from "../fonts/fonte_titulo_amarelo";

const { width, height } = Dimensions.get("window");

const margem_titulo_x = width * 0.05;
const margem_titulo_y = width * 0.10;
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
        flex:1,
        justifyContent:"flex-start",
        alignItems:"center",
        paddingTop:padding_top,

        zIndex:2,
    },
})