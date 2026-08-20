import React from 'react';
import { Pressable, Text, StyleSheet, GestureResponderEvent } from 'react-native';
import { GlassView } from '../GlassView/GlassView';

type GlassButtonProps = {
    label: string;
    onPress?: (e: GestureResponderEvent) => void;
    textColor?: string;
};

export function GlassButton({ label, onPress, textColor = '#fff' }: GlassButtonProps) {
    return (
        <Pressable onPress={onPress}>
            <GlassView style={styles.button} intensity={50}>
                <Text style={[styles.text, { color: textColor }]}>{label}</Text>
            </GlassView>
        </Pressable>
    )
}


const styles = StyleSheet.create({
    button: {
        paddingVertical: 12,
        paddingHorizontal: 24,
        alignItems: 'center',
        justifyContent: 'center',
    },
    text: {
        fontSize: 16,
        fontWeight:'600'
    }
})
