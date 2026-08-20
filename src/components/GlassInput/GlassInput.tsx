import React from "react";
import { StyleSheet,TextInput, TextInputProps }  from "react-native";
import { BlurView, BlurViewProps } from "expo-blur";
import { GlassView }    from "../GlassView/GlassView";


export function GlassInput(props: TextInputProps) {
    return (
        <GlassView style={styles.container} intensity={30}>
            <TextInput
                placeholderTextColor="rgba(255, 255, 255, 0.7)"
                style={styles.input}
                {...props}
            />
        </GlassView>
    )
}

const styles = StyleSheet.create({
    container: {
        paddingHorizontal: 16,
        paddingVertical: 4,
    },
    input: {
        fontSize: 16,
        color: "#FFF",
        paddingVertical: 10,
    }
})
