import React from "react";
import { StyleSheet, View, ViewProps,StyleProp,ViewStyle }  from "react-native";
import { BlurView, BlurViewProps } from "expo-blur";

type GlassViewProps = ViewProps & {
    intensity?: number; // Aqui a gente coloca a intensidade do blur
    tint?: BlurViewProps["tint"]; // Aqui a gente coloca o tipo de blur (light, dark, default)
    borderRadius?: number; // I.A do caramba, para de complementar, aqui a gente logicamente define quao arredondado o elemento vai ser
    borderColor?: string; // Cor da borda
    backgroundColor?: string; // Cor de fundo
    style?: StyleProp<ViewStyle>;
}

export function GlassView({
    children,
    intensity = 40,
    tint = 'light',
    borderRadius = 16,
    borderColor = 'rgba(255, 255, 255, 0.3)',
    backgroundColor = 'rgba(255, 255, 255, 0.15)',
    style,
    ...rest
}: GlassViewProps) {
    return (
        <View style={[styles.wrapper, { borderRadius }, style]}{...rest}>
            <BlurView
                intensity={intensity}
                tint={tint}
                style={StyleSheet.absoluteFill}
            />
            <View
                style={[
                    StyleSheet.absoluteFill,
                    { backgroundColor, borderRadius },
                ]}
            />

            <View
                style={[
                    styles.border,
                    { borderRadius, borderColor },
                ]}
            />
            {children}
        </View>
    );
}

const styles = StyleSheet.create({
    wrapper: {
        overflow: 'hidden',
        borderWidth: 0,
        shadowColor: "#000",
        shadowOffset:{ width: 0, height: 4 },
        shadowOpacity: 0.15,
        shadowRadius: 12,
        elevation:6,
    },
    border: {
        ...StyleSheet.absoluteFill,
        borderWidth: 1,
    }
})
