import { Background } from "expo-router/build/react-navigation";
import { StyleSheet } from "react-native";

export const styles = StyleSheet.create({
    background: {
        flex: 1,
    },

    overlay: {
        flex: 1,
        justifyContent: "space-between",
        paddingTop: 100,
        paddingBottom: 40,
        paddingHorizontal:24,
    },

    titleWhite: {
        color: "#FFF",
        fontSize: 52,
        fontWeight: "700",
        lineHeight:56,
    },
    titleYellow: {
        color: "#FFD21E",
        fontSize: 60,
        fontWeight: "800",
        lineHeight:62
    },

 dot: {
    width: 10,
    height: 10,
    borderRadius: 6,
    backgroundColor: "#FFFFFF",
    marginHorizontal: 5,
    opacity: 0.4,
},

    activeDot: {
        opacity: 1,
        backgroundColor:"#FFD21E"
    },
    dots: {
        flexDirection: "row",
        justifyContent: "center",
        alignItems:"center"
    }
})
