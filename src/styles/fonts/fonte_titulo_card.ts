import { StyleSheet, Dimensions } from "react-native";

const { width } = Dimensions.get("window");

const tamanho_titulo = width * 0.070; // width * 0.15 é literal 15% do tamanho da tela

export const fonte_titulo_card = StyleSheet.create({
    titulo_principal: {
        fontWeight: "bold",
        color: "white",
        fontSize: tamanho_titulo, // width * 0.045 é literal 4.5% do tamanho da tela,
    },
})