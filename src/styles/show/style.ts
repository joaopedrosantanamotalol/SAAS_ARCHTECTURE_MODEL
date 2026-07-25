import { StyleSheet, Dimensions } from "react-native";

import { fonte_titulo } from "../fonts/fonte_titulo";
import { fonte_destaque } from "../fonts/fonte_titulo_amarelo";

const { width } = Dimensions.get("window");
const margem_titulo_x = width * 0.05;
const margem_titulo_y = width * 0.15;

export const style = StyleSheet.create({
    background:{
        flex:1,
        backgroundColor: "black"
    },
    view_titulo:{
        flexDirection:"row",
        gap:5,
        flexWrap:"wrap",
        marginHorizontal: margem_titulo_x,
        marginVertical:margem_titulo_y,
    },
    fonte_titulo: {
       ...fonte_titulo.titulo_principal
    },
    titulo_destaque:{
       ...fonte_destaque.titulo_principal_destaque
    },
})