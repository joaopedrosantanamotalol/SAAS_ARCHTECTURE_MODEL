import { StyleSheet, Dimensions } from "react-native";

const { width } = Dimensions.get("window");

const tamanho_titulo = width * 0.090; // width * 0.15 é literal 15% do tamanho da tela

export const fonte_destaque = StyleSheet.create({
    titulo_principal_destaque:{
        fontWeight: "bold",
        color: "#FDD911",
        fontSize: tamanho_titulo,
        marginHorizontal: 5
    },
})